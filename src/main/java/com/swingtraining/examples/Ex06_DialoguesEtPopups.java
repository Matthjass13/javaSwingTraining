package com.swingtraining.examples;

import javax.swing.*;
import java.awt.*;

/**
 * EXEMPLE 06 — Dialogues et fenêtres pop-up
 *
 * Concepts abordés :
 *  - JOptionPane   : boîtes de dialogue prêtes à l'emploi (message, confirmation, saisie, choix)
 *  - JDialog       : fenêtre secondaire personnalisée (modale ou non)
 *  - JFileChooser  : sélecteur de fichier natif
 *  - JColorChooser : sélecteur de couleur
 *
 * Vocabulaire :
 *  - Dialogue MODAL    : bloque la fenêtre parente tant qu'il est ouvert.
 *  - Dialogue NON MODAL: la fenêtre parente reste utilisable.
 */
public class Ex06_DialoguesEtPopups {

    private JLabel labelStatut;
    private JFrame fenetrePrincipale;

    public Ex06_DialoguesEtPopups() {
        construireFenetre();
    }

    private void construireFenetre() {
        fenetrePrincipale = new JFrame("Exemple 06 — Dialogues et pop-ups");
        fenetrePrincipale.setSize(500, 420);
        fenetrePrincipale.setLocationRelativeTo(null);
        fenetrePrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetrePrincipale.setLayout(new BorderLayout());

        // -- Panel de titre --
        JPanel panelTitre = new JPanel();
        panelTitre.setBackground(new Color(60, 80, 120));
        panelTitre.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));
        JLabel titre = new JLabel("Démonstration des dialogues Swing");
        titre.setFont(new Font("Arial", Font.BOLD, 15));
        titre.setForeground(Color.WHITE);
        panelTitre.add(titre);
        fenetrePrincipale.add(panelTitre, BorderLayout.NORTH);

        // -- Grille de boutons --
        JPanel grille = new JPanel(new GridLayout(4, 2, 12, 12));
        grille.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        grille.add(creerBouton("💬 Message simple",     this::ouvrirMessageSimple));
        grille.add(creerBouton("⚠ Message d'erreur",   this::ouvrirMessageErreur));
        grille.add(creerBouton("❓ Confirmation Oui/Non", this::ouvrirConfirmation));
        grille.add(creerBouton("✏ Saisie utilisateur", this::ouvrirSaisie));
        grille.add(creerBouton("📋 Choix dans une liste", this::ouvrirChoixListe));
        grille.add(creerBouton("📁 Sélecteur de fichier", this::ouvrirSelecteurFichier));
        grille.add(creerBouton("🎨 Sélecteur de couleur", this::ouvrirSelecteurCouleur));
        grille.add(creerBouton("🔲 Dialogue personnalisé", this::ouvrirDialoguePersonnalise));

        fenetrePrincipale.add(grille, BorderLayout.CENTER);

        // -- Barre de statut --
        JPanel panelStatut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelStatut.setBackground(new Color(240, 240, 240));
        labelStatut = new JLabel("Cliquez sur un bouton pour ouvrir un dialogue.");
        labelStatut.setFont(new Font("Arial", Font.ITALIC, 12));
        panelStatut.add(labelStatut);
        fenetrePrincipale.add(panelStatut, BorderLayout.SOUTH);

        fenetrePrincipale.setVisible(true);
    }

    // --- Méthodes d'ouverture de dialogues ---

    private void ouvrirMessageSimple() {
        /*
         * showMessageDialog : affiche un message et un bouton "OK".
         * Paramètres : (fenêtreParente, message, titre, typeIcone)
         * Types d'icône : INFORMATION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE,
         *                 QUESTION_MESSAGE, PLAIN_MESSAGE (sans icône)
         */
        JOptionPane.showMessageDialog(
            fenetrePrincipale,
            "Voici un message informatif simple.\nIl peut tenir sur plusieurs lignes.",
            "Information",
            JOptionPane.INFORMATION_MESSAGE
        );
        setStatut("Message simple : fermé.");
    }

    private void ouvrirMessageErreur() {
        JOptionPane.showMessageDialog(
            fenetrePrincipale,
            "Une erreur s'est produite !\nVeuillez réessayer.",
            "Erreur",
            JOptionPane.ERROR_MESSAGE
        );
        setStatut("Message d'erreur : fermé.");
    }

    private void ouvrirConfirmation() {
        /*
         * showConfirmDialog : affiche Oui / Non (ou Oui / Non / Annuler).
         * Retourne : YES_OPTION (0), NO_OPTION (1), CANCEL_OPTION (2), CLOSED_OPTION (-1)
         */
        int reponse = JOptionPane.showConfirmDialog(
            fenetrePrincipale,
            "Voulez-vous vraiment continuer ?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION,          // Boutons affichés
            JOptionPane.QUESTION_MESSAGE         // Icône
        );

        if (reponse == JOptionPane.YES_OPTION) {
            setStatut("Confirmation : l'utilisateur a cliqué OUI.");
        } else {
            setStatut("Confirmation : l'utilisateur a cliqué NON (ou fermé).");
        }
    }

    private void ouvrirSaisie() {
        /*
         * showInputDialog : affiche un champ texte et retourne la valeur saisie.
         * Retourne null si l'utilisateur annule ou ferme la fenêtre.
         */
        String saisie = JOptionPane.showInputDialog(
            fenetrePrincipale,
            "Quel est votre prénom ?",
            "Saisie",
            JOptionPane.QUESTION_MESSAGE
        );

        if (saisie != null && !saisie.trim().isEmpty()) {
            setStatut("Saisie reçue : \"" + saisie + "\"");
        } else {
            setStatut("Saisie : annulée ou vide.");
        }
    }

    private void ouvrirChoixListe() {
        String[] options = {"☕ Café", "🍵 Thé", "🧃 Jus", "💧 Eau"};

        /*
         * showInputDialog avec un tableau d'options : affiche une liste déroulante.
         * Dernier paramètre = valeur présélectionnée.
         */
        String choix = (String) JOptionPane.showInputDialog(
            fenetrePrincipale,
            "Choisissez une boisson :",
            "Liste de choix",
            JOptionPane.QUESTION_MESSAGE,
            null,       // Icône personnalisée (null = icône par défaut)
            options,
            options[0]  // Valeur présélectionnée
        );

        setStatut(choix != null ? "Choix : " + choix : "Choix : annulé.");
    }

    private void ouvrirSelecteurFichier() {
        /*
         * JFileChooser : boîte de dialogue native pour sélectionner un fichier ou dossier.
         * showOpenDialog() retourne APPROVE_OPTION si l'utilisateur valide.
         */
        JFileChooser selecteur = new JFileChooser();
        selecteur.setDialogTitle("Choisissez un fichier");

        int resultat = selecteur.showOpenDialog(fenetrePrincipale);

        if (resultat == JFileChooser.APPROVE_OPTION) {
            String chemin = selecteur.getSelectedFile().getAbsolutePath();
            setStatut("Fichier sélectionné : " + chemin);
        } else {
            setStatut("Sélecteur de fichier : annulé.");
        }
    }

    private void ouvrirSelecteurCouleur() {
        /*
         * JColorChooser.showDialog() : dialogue de sélection de couleur.
         * Retourne null si annulé.
         */
        Color couleur = JColorChooser.showDialog(
            fenetrePrincipale,
            "Choisissez une couleur",
            Color.BLUE  // Couleur présélectionnée
        );

        if (couleur != null) {
            String hex = String.format("#%02X%02X%02X", couleur.getRed(), couleur.getGreen(), couleur.getBlue());
            setStatut("Couleur choisie : " + hex);
            labelStatut.setForeground(couleur);
        } else {
            setStatut("Sélecteur de couleur : annulé.");
        }
    }

    private void ouvrirDialoguePersonnalise() {
        /*
         * JDialog : fenêtre secondaire entièrement personnalisable.
         * true = modal (bloque la fenêtre parente jusqu'à fermeture).
         */
        JDialog dialogue = new JDialog(fenetrePrincipale, "Dialogue personnalisé", true);
        dialogue.setSize(320, 200);
        dialogue.setLocationRelativeTo(fenetrePrincipale);
        dialogue.setLayout(new BorderLayout());

        JLabel message = new JLabel("<html><center>Ceci est un dialogue<br>entièrement personnalisé !</center></html>");
        message.setFont(new Font("Arial", Font.PLAIN, 14));
        message.setHorizontalAlignment(JLabel.CENTER);
        dialogue.add(message, BorderLayout.CENTER);

        JPanel panelBoutons = new JPanel(new FlowLayout());
        JButton btnFermer = new JButton("Fermer");
        // Fermer le dialogue (ne ferme PAS la fenêtre principale)
        btnFermer.addActionListener(e -> dialogue.dispose());
        panelBoutons.add(btnFermer);
        dialogue.add(panelBoutons, BorderLayout.SOUTH);

        // setVisible(true) sur un dialogue modal bloque jusqu'à sa fermeture
        dialogue.setVisible(true);

        setStatut("Dialogue personnalisé : fermé.");
    }

    // --- Utilitaires ---

    private JButton creerBouton(String texte, Runnable action) {
        JButton btn = new JButton(texte);
        btn.addActionListener(e -> action.run());
        return btn;
    }

    private void setStatut(String message) {
        labelStatut.setText(message);
        labelStatut.setForeground(Color.DARK_GRAY);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex06_DialoguesEtPopups::new);
    }
}
