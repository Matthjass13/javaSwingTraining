package com.swingtraining.examples.ex07;

import javax.swing.*;
import java.awt.*;

/**
 * EXEMPLE 07 — Les interfaces Java illustrées par un système de sauvegarde
 *
 * Concepts abordés :
 *  - Interface Java : définir un contrat commun à plusieurs classes
 *  - Polymorphisme  : une variable de type interface peut pointer vers
 *                     n'importe laquelle de ses implémentations
 *  - Interchangeabilité : changer de format de sauvegarde sans toucher
 *                         au code de l'interface graphique
 *
 * Structure du package ex07 :
 *  - FormatSauvegarde   (interface)     ← le contrat
 *  - SauvegardeJSON     (implements)    ← implémentation JSON
 *  - SauvegardeXML      (implements)    ← implémentation XML
 *  - SauvegardeCSV      (implements)    ← implémentation CSV
 *  - Utilisateur        (modèle)        ← les données
 *  - Ex07_Interfaces    (Swing / main)  ← l'interface graphique
 *
 * POINT CLÉ à observer dans ce fichier :
 *   La variable "formatActuel" est de type FormatSauvegarde (l'interface),
 *   pas de type SauvegardeJSON ou SauvegardeXML.
 *   Quand l'utilisateur change de format, on remplace juste l'objet pointé
 *   par cette variable. Le bouton "Sauvegarder" n'a jamais besoin de savoir
 *   quel format est actif — il appelle toujours formatActuel.serialiser().
 */
public class Ex07_Interfaces {

    // Champs de saisie
    private JTextField champNom;
    private JTextField champPrenom;
    private JSpinner   spinnerAge;

    // Zone d'affichage du résultat de la sérialisation
    private JTextArea zoneResultat;

    // Label indiquant quel format est actuellement sélectionné
    private JLabel labelFormatActif;

    /*
     * LA VARIABLE CLÉ de cet exercice.
     *
     * Son type est l'INTERFACE, pas une implémentation concrète.
     * Cela signifie qu'elle peut contenir un SauvegardeJSON,
     * un SauvegardeXML, ou n'importe quelle autre classe qui
     * implémente FormatSauvegarde — même une qu'on n'a pas encore écrite.
     *
     * On dit que le code Swing est "découplé" du format de sauvegarde.
     */
    private FormatSauvegarde formatActuel;

    public Ex07_Interfaces() {
        // Format par défaut au démarrage de l'application
        formatActuel = new SauvegardeJSON();
        construireFenetre();
    }

    private void construireFenetre() {
        JFrame fenetre = new JFrame("Exemple 07 — Interfaces Java");
        fenetre.setSize(620, 520);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(new BorderLayout(10, 10));

        fenetre.add(creerPanelSaisie(),   BorderLayout.NORTH);
        fenetre.add(creerPanelFormats(),  BorderLayout.WEST);
        fenetre.add(creerPanelResultat(), BorderLayout.CENTER);

        fenetre.getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        fenetre.setVisible(true);
    }


    // =========================================================================
    // Panel NORD : saisie des données utilisateur
    // =========================================================================

    private JPanel creerPanelSaisie() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 8, 8));
        panel.setBorder(BorderFactory.createTitledBorder("Données de l'utilisateur"));

        panel.add(new JLabel("Nom :"));
        champNom = new JTextField("Dupont");
        panel.add(champNom);

        panel.add(new JLabel("Prénom :"));
        champPrenom = new JTextField("Alice");
        panel.add(champPrenom);

        panel.add(new JLabel("Âge :"));
        spinnerAge = new JSpinner(new SpinnerNumberModel(30, 0, 150, 1));
        panel.add(spinnerAge);

        // Bouton de sauvegarde
        panel.add(new JLabel());  // Cellule vide pour l'alignement de la grille

        JButton boutonSauvegarder = new JButton("Sauvegarder");
        boutonSauvegarder.setBackground(new Color(50, 120, 200));
        boutonSauvegarder.setForeground(Color.WHITE);
        boutonSauvegarder.setOpaque(true);

        boutonSauvegarder.addActionListener(e -> sauvegarder());

        panel.add(boutonSauvegarder);

        return panel;
    }


    // =========================================================================
    // Panel OUEST : sélection du format de sauvegarde
    // =========================================================================

    private JPanel creerPanelFormats() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Format"));
        panel.setPreferredSize(new Dimension(140, 0));

        /*
         * On crée les trois implémentations de l'interface.
         * Chaque bouton radio, quand cliqué, réassigne "formatActuel"
         * à l'implémentation correspondante.
         *
         * Notez qu'on crée les objets UNE SEULE FOIS et qu'on réutilise
         * la même référence à chaque sélection.
         */
        FormatSauvegarde json = new SauvegardeJSON();
        FormatSauvegarde xml  = new SauvegardeXML();
        FormatSauvegarde csv  = new SauvegardeCSV();

        ButtonGroup groupe = new ButtonGroup();

        JRadioButton radioJSON = creerRadioFormat(json, groupe, true);
        JRadioButton radioXML  = creerRadioFormat(xml,  groupe, false);
        JRadioButton radioCSV  = creerRadioFormat(csv,  groupe, false);

        // Description pédagogique sous les boutons
        JTextArea explication = new JTextArea(
            "Changer de format ici ne modifie pas le code du bouton \"Sauvegarder\"."
        );
        explication.setWrapStyleWord(true);
        explication.setLineWrap(true);
        explication.setEditable(false);
        explication.setOpaque(false);
        explication.setFont(new Font("Arial", Font.ITALIC, 10));
        explication.setForeground(Color.DARK_GRAY);
        explication.setBorder(BorderFactory.createEmptyBorder(8, 4, 0, 4));

        panel.add(Box.createVerticalStrut(8));
        panel.add(radioJSON);
        panel.add(radioXML);
        panel.add(radioCSV);
        panel.add(explication);

        return panel;
    }

    /**
     * Crée un JRadioButton associé à une implémentation de FormatSauvegarde.
     *
     * Quand ce bouton est sélectionné, "formatActuel" est réassigné
     * à l'implémentation passée en paramètre.
     *
     * @param format         L'implémentation à utiliser quand ce radio est sélectionné
     * @param groupe         Le ButtonGroup auquel appartient ce radio
     * @param selectionneParDefaut  Si true, ce radio est coché au démarrage
     */
    private JRadioButton creerRadioFormat(FormatSauvegarde format, ButtonGroup groupe, boolean selectionneParDefaut) {
        JRadioButton radio = new JRadioButton(format.getNomFormat());
        radio.setSelected(selectionneParDefaut);
        radio.setAlignmentX(Component.LEFT_ALIGNMENT);

        radio.addActionListener(e -> {
            /*
             * C'est ici que la magie des interfaces opère :
             * on réassigne la variable "formatActuel" (de type interface)
             * à une nouvelle implémentation concrète.
             *
             * Le reste du code (le bouton Sauvegarder, etc.)
             * ne changera absolument pas de comportement — il appellera
             * toujours "formatActuel.serialiser()" sans se soucier
             * de ce qu'il y a derrière.
             */
            formatActuel = format;
            labelFormatActif.setText("Format actif : " + format.getNomFormat());

            // Mettre à jour le résultat en direct si des données sont déjà saisies
            if (!champNom.getText().isBlank()) {
                sauvegarder();
            }
        });

        groupe.add(radio);
        return radio;
    }


    // =========================================================================
    // Panel CENTER : affichage du résultat
    // =========================================================================

    private JPanel creerPanelResultat() {
        JPanel panel = new JPanel(new BorderLayout(0, 6));
        panel.setBorder(BorderFactory.createTitledBorder("Résultat de la sérialisation"));

        // Label indiquant le format actif
        labelFormatActif = new JLabel("Format actif : " + formatActuel.getNomFormat());
        labelFormatActif.setFont(new Font("Arial", Font.BOLD, 12));
        labelFormatActif.setForeground(new Color(50, 100, 180));
        panel.add(labelFormatActif, BorderLayout.NORTH);

        // Zone de texte en lecture seule affichant la sortie sérialisée
        zoneResultat = new JTextArea();
        zoneResultat.setEditable(false);
        zoneResultat.setFont(new Font("Monospaced", Font.PLAIN, 13));
        zoneResultat.setBackground(new Color(245, 245, 245));
        zoneResultat.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        panel.add(new JScrollPane(zoneResultat), BorderLayout.CENTER);

        // Message d'aide en bas
        JLabel aide = new JLabel("Remplissez les champs et cliquez sur Sauvegarder.");
        aide.setFont(new Font("Arial", Font.ITALIC, 11));
        aide.setForeground(Color.GRAY);
        panel.add(aide, BorderLayout.SOUTH);

        return panel;
    }


    // =========================================================================
    // Logique de sauvegarde
    // =========================================================================

    private void sauvegarder() {
        // Validation basique
        String nom    = champNom.getText().trim();
        String prenom = champPrenom.getText().trim();
        int    age    = (Integer) spinnerAge.getValue();

        if (nom.isEmpty() || prenom.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "Veuillez remplir le nom et le prénom.",
                "Champs manquants",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Créer l'objet utilisateur
        Utilisateur utilisateur = new Utilisateur(nom, prenom, age);

        /*
         * APPEL POLYMORPHE :
         * On appelle serialiser() sur "formatActuel", qui est de type FormatSauvegarde.
         * Java choisit automatiquement la bonne implémentation à l'exécution
         * (JSON, XML ou CSV selon ce que contient "formatActuel").
         *
         * Cette ligne de code NE CHANGE JAMAIS, quel que soit le format sélectionné.
         * C'est l'avantage fondamental des interfaces.
         */
        String resultat = formatActuel.serialiser(utilisateur);

        // Afficher le résultat dans la zone de texte
        zoneResultat.setText(resultat);
        labelFormatActif.setText("Format actif : " + formatActuel.getNomFormat());
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex07_Interfaces::new);
    }
}
