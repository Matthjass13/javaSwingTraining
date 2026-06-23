package com.swingtraining.examples;

import javax.swing.*;
import java.awt.*;

/**
 * EXEMPLE 04 — Les gestionnaires de mise en page (Layout Managers)
 *
 * Concepts abordés :
 *  - BorderLayout  : divise l'espace en 5 zones (NORTH, SOUTH, EAST, WEST, CENTER)
 *  - GridLayout    : grille régulière (toutes les cellules ont la même taille)
 *  - FlowLayout    : composants disposés en ligne, comme du texte
 *  - Imbrication de panels pour obtenir des mises en page complexes
 *
 * Astuce : en Swing, on n'utilise jamais de coordonnées absolues (x, y).
 * On laisse les Layout Managers calculer les positions automatiquement,
 * ce qui rend l'interface adaptable à différentes tailles d'écran.
 */
public class Ex04_MiseEnPage {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex04_MiseEnPage::new);
    }

    public Ex04_MiseEnPage() {
        JFrame fenetre = new JFrame("Exemple 04 — Mise en page (Layouts)");
        fenetre.setSize(600, 500);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * BORDERLAYOUT (layout par défaut de JFrame)
         * Divise l'espace en 5 zones :
         *   NORTH  → barre en haut
         *   SOUTH  → barre en bas
         *   WEST   → colonne à gauche
         *   EAST   → colonne à droite
         *   CENTER → tout le reste (la zone principale)
         */
        fenetre.setLayout(new BorderLayout());

        // -- NORTH : barre de titre en haut --
        JPanel panelNord = new JPanel();
        panelNord.setBackground(new Color(50, 100, 180));
        panelNord.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelTitre = new JLabel("Démonstration des Layout Managers");
        labelTitre.setFont(new Font("Arial", Font.BOLD, 16));
        labelTitre.setForeground(Color.WHITE);
        panelNord.add(labelTitre);

        fenetre.add(panelNord, BorderLayout.NORTH);  // On précise la zone avec la constante


        // -- WEST : panel latéral gauche avec FlowLayout --
        JPanel panelOuest = new JPanel();
        panelOuest.setLayout(new BoxLayout(panelOuest, BoxLayout.Y_AXIS));
        panelOuest.setBackground(new Color(240, 240, 240));
        panelOuest.setBorder(BorderFactory.createTitledBorder("Menu (WEST)"));
        panelOuest.setPreferredSize(new Dimension(150, 0));  // Largeur fixe, hauteur automatique

        String[] items = {"Accueil", "Profil", "Paramètres", "Aide"};
        for (String item : items) {
            JButton btn = new JButton(item);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(120, 35));
            panelOuest.add(Box.createVerticalStrut(8));
            panelOuest.add(btn);
        }

        fenetre.add(panelOuest, BorderLayout.WEST);


        // -- CENTER : grille avec GridLayout --
        /*
         * GridLayout(lignes, colonnes) crée une grille où TOUTES les cellules
         * ont exactement la même taille.
         * GridLayout(0, 2) = 2 colonnes, nombre de lignes automatique.
         */
        JPanel panelCentre = new JPanel(new GridLayout(3, 2, 10, 10));
        // Les deux derniers paramètres : espacement horizontal et vertical entre cellules
        panelCentre.setBorder(BorderFactory.createTitledBorder("Grille 3×2 (CENTER — GridLayout)"));
        panelCentre.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10),
            BorderFactory.createTitledBorder("Grille 3×2 (CENTER — GridLayout)")
        ));

        // Couleurs pour différencier les cellules
        Color[] couleurs = {
            new Color(255, 200, 200),
            new Color(200, 255, 200),
            new Color(200, 200, 255),
            new Color(255, 255, 200),
            new Color(255, 200, 255),
            new Color(200, 255, 255)
        };

        for (int i = 1; i <= 6; i++) {
            JPanel cellule = new JPanel(new BorderLayout());
            cellule.setBackground(couleurs[i - 1]);
            cellule.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            JLabel lbl = new JLabel("Cellule " + i, JLabel.CENTER);
            lbl.setFont(new Font("Arial", Font.BOLD, 13));
            cellule.add(lbl, BorderLayout.CENTER);

            panelCentre.add(cellule);
        }

        fenetre.add(panelCentre, BorderLayout.CENTER);


        // -- SOUTH : barre de statut en bas avec FlowLayout --
        JPanel panelSud = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelSud.setBackground(new Color(220, 220, 220));
        panelSud.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY));
        // MatteBorder : bordure uniquement sur certains côtés (ici : seulement en haut)

        JLabel labelStatut = new JLabel("Statut : prêt  |  Layout : BorderLayout + GridLayout imbriqués");
        labelStatut.setFont(new Font("Arial", Font.PLAIN, 11));
        labelStatut.setForeground(Color.DARK_GRAY);
        panelSud.add(labelStatut);

        fenetre.add(panelSud, BorderLayout.SOUTH);


        fenetre.setVisible(true);
    }
}
