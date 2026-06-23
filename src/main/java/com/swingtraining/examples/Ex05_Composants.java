package com.swingtraining.examples;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * EXEMPLE 05 — Les composants courants de Swing
 *
 * Concepts abordés :
 *  - JTextField     : champ de texte (saisie libre, une ligne)
 *  - JTextArea      : zone de texte multiligne
 *  - JCheckBox      : case à cocher (oui/non)
 *  - JRadioButton   : bouton radio (choix exclusif dans un groupe)
 *  - ButtonGroup    : groupe de boutons radio (un seul sélectionnable à la fois)
 *  - JComboBox      : liste déroulante
 *  - JSlider        : curseur de valeur numérique
 *  - JSpinner       : sélecteur de valeur numérique par incréments
 *  - Lire les valeurs de tous ces composants au clic d'un bouton
 */
public class Ex05_Composants {

    // Tous les composants sont des champs pour pouvoir lire leurs valeurs
    private JTextField champNom;
    private JTextArea  champDescription;
    private JCheckBox  checkNewsletter;
    private JCheckBox  checkCGU;
    private JRadioButton radioHomme;
    private JRadioButton radioFemme;
    private JRadioButton radioAutre;
    private JComboBox<String> comboPays;
    private JSlider   sliderAge;
    private JSpinner  spinnerAge;

    public Ex05_Composants() {
        construireFenetre();
    }

    private void construireFenetre() {
        JFrame fenetre = new JFrame("Exemple 05 — Composants Swing courants");
        fenetre.setSize(550, 680);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal avec défilement vertical (au cas où la fenêtre est trop petite)
        JPanel contenu = new JPanel();
        contenu.setLayout(new BoxLayout(contenu, BoxLayout.Y_AXIS));
        contenu.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        contenu.add(creerSectionTexte());
        contenu.add(Box.createVerticalStrut(10));
        contenu.add(creerSectionChoix());
        contenu.add(Box.createVerticalStrut(10));
        contenu.add(creerSectionNumerique());
        contenu.add(Box.createVerticalStrut(15));
        contenu.add(creerBoutonLire());

        // JScrollPane ajoute des barres de défilement si le contenu dépasse la taille
        JScrollPane scrollPane = new JScrollPane(contenu);
        fenetre.add(scrollPane);

        fenetre.setVisible(true);
    }

    // -------------------------------------------------------------------------
    // Section 1 : composants texte
    // -------------------------------------------------------------------------
    private JPanel creerSectionTexte() {
        JPanel panel = creerPanelSection("Saisie de texte");

        // JTextField : champ texte simple sur une ligne
        champNom = new JTextField();
        champNom.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));  // Largeur max = infinie
        ajouterLabelEtComposant(panel, "Nom complet :", champNom);

        // JComboBox : liste déroulante
        String[] pays = {"France", "Belgique", "Suisse", "Canada", "Autre"};
        comboPays = new JComboBox<>(pays);
        comboPays.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        ajouterLabelEtComposant(panel, "Pays :", comboPays);

        // JTextArea : zone de texte multiligne
        champDescription = new JTextArea(4, 30);
        champDescription.setLineWrap(true);      // Retour à la ligne automatique
        champDescription.setWrapStyleWord(true); // Couper au niveau des mots, pas des caractères
        // On enveloppe la JTextArea dans un JScrollPane pour avoir la barre de défilement
        JScrollPane scrollDescription = new JScrollPane(champDescription);
        scrollDescription.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        ajouterLabelEtComposant(panel, "Description :", scrollDescription);

        return panel;
    }

    // -------------------------------------------------------------------------
    // Section 2 : cases à cocher et boutons radio
    // -------------------------------------------------------------------------
    private JPanel creerSectionChoix() {
        JPanel panel = creerPanelSection("Cases à cocher et boutons radio");

        // JCheckBox : case à cocher indépendante
        checkNewsletter = new JCheckBox("S'abonner à la newsletter");
        checkCGU = new JCheckBox("J'accepte les conditions générales");
        checkCGU.setSelected(true);  // Coché par défaut

        panel.add(checkNewsletter);
        panel.add(checkCGU);
        panel.add(Box.createVerticalStrut(8));

        // JRadioButton avec ButtonGroup (un seul sélectionnable à la fois)
        panel.add(new JLabel("Genre :"));

        radioHomme = new JRadioButton("Homme");
        radioFemme = new JRadioButton("Femme");
        radioAutre = new JRadioButton("Autre");
        radioHomme.setSelected(true);  // Sélectionné par défaut

        /*
         * ButtonGroup lie les boutons radio entre eux.
         * Quand on en coche un, l'ancien est automatiquement décoché.
         * ATTENTION : ButtonGroup ne gère PAS la disposition visuelle,
         * il faut toujours ajouter les boutons au panel séparément.
         */
        ButtonGroup groupe = new ButtonGroup();
        groupe.add(radioHomme);
        groupe.add(radioFemme);
        groupe.add(radioAutre);

        JPanel panelRadios = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        panelRadios.setOpaque(false);
        panelRadios.add(radioHomme);
        panelRadios.add(radioFemme);
        panelRadios.add(radioAutre);
        panel.add(panelRadios);

        return panel;
    }

    // -------------------------------------------------------------------------
    // Section 3 : curseurs et sélecteurs numériques
    // -------------------------------------------------------------------------
    private JPanel creerSectionNumerique() {
        JPanel panel = creerPanelSection("Valeurs numériques");

        // JSlider : curseur (min, max, valeur initiale)
        sliderAge = new JSlider(0, 100, 25);
        sliderAge.setMajorTickSpacing(25);  // Marques tous les 25
        sliderAge.setMinorTickSpacing(5);   // Petites marques tous les 5
        sliderAge.setPaintTicks(true);      // Afficher les marques
        sliderAge.setPaintLabels(true);     // Afficher les chiffres sous les marques

        // Quand le curseur bouge, synchroniser le spinner
        sliderAge.addChangeListener(e -> spinnerAge.setValue(sliderAge.getValue()));

        ajouterLabelEtComposant(panel, "Âge (slider) :", sliderAge);

        // JSpinner : sélecteur numérique avec flèches haut/bas
        // SpinnerNumberModel(valeurInitiale, min, max, pas)
        SpinnerNumberModel modeleSpinner = new SpinnerNumberModel(25, 0, 100, 1);
        spinnerAge = new JSpinner(modeleSpinner);
        spinnerAge.setMaximumSize(new Dimension(80, 30));

        // Quand le spinner change, synchroniser le slider
        spinnerAge.addChangeListener(e -> sliderAge.setValue((Integer) spinnerAge.getValue()));

        ajouterLabelEtComposant(panel, "Âge (spinner) :", spinnerAge);

        return panel;
    }

    // -------------------------------------------------------------------------
    // Bouton "Lire les valeurs"
    // -------------------------------------------------------------------------
    private JButton creerBoutonLire() {
        JButton bouton = new JButton("▶ Lire toutes les valeurs");
        bouton.setAlignmentX(Component.CENTER_ALIGNMENT);
        bouton.setFont(new Font("Arial", Font.BOLD, 13));
        bouton.setBackground(new Color(50, 100, 200));
        bouton.setForeground(Color.WHITE);
        bouton.setOpaque(true);

        bouton.addActionListener(e -> {
            // Lire le bouton radio sélectionné
            String genre = radioHomme.isSelected() ? "Homme"
                         : radioFemme.isSelected() ? "Femme"
                         : "Autre";

            // Construire le résumé
            String message = String.format(
                "Nom        : %s%n" +
                "Pays       : %s%n" +
                "Genre      : %s%n" +
                "Âge        : %d%n" +
                "Newsletter : %s%n" +
                "CGU        : %s%n%n" +
                "Description :%n%s",
                champNom.getText(),
                comboPays.getSelectedItem(),
                genre,
                (Integer) spinnerAge.getValue(),
                checkNewsletter.isSelected() ? "Oui" : "Non",
                checkCGU.isSelected() ? "Acceptées" : "Non acceptées",
                champDescription.getText()
            );

            // Afficher dans une boîte de dialogue d'information
            JOptionPane.showMessageDialog(
                null,
                message,
                "Valeurs saisies",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        return bouton;
    }

    // -------------------------------------------------------------------------
    // Méthodes utilitaires (pour éviter la répétition)
    // -------------------------------------------------------------------------

    /** Crée un panel vertical avec un titre encadré. */
    private JPanel creerPanelSection(String titre) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.LIGHT_GRAY),
            titre,
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new Font("Arial", Font.BOLD, 12),
            Color.DARK_GRAY
        ));
        return panel;
    }

    /** Ajoute un label puis un composant dans un panel vertical. */
    private void ajouterLabelEtComposant(JPanel panel, String texteLabel, JComponent composant) {
        JLabel label = new JLabel(texteLabel);
        label.setBorder(BorderFactory.createEmptyBorder(6, 4, 2, 0));
        panel.add(label);
        panel.add(composant);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex05_Composants::new);
    }
}
