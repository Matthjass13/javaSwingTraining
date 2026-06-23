package com.swingtraining.examples;

import javax.swing.*;       // Importe tous les composants Swing (JFrame, JButton, JLabel...)
import java.awt.*;          // Importe les outils de mise en page (FlowLayout, Color, Font...)
import java.awt.event.*;    // Importe les classes pour gérer les événements (clics, etc.)

/**
 * EXEMPLE 02 — Boutons et gestion des événements (clics)
 *
 * Concepts abordés :
 *  - Créer des JButton (boutons cliquables)
 *  - Réagir aux clics avec ActionListener (interface de rappel / "callback")
 *  - Modifier dynamiquement un JLabel après un clic
 *  - Utiliser FlowLayout pour disposer les composants
 *  - Personnaliser les couleurs et polices
 */
public class Ex02_BoutonsEtEvenements {

    // On déclare le compteur comme variable d'instance pour y accéder depuis les lambdas
    private int compteur = 0;

    // Le label d'affichage est aussi un champ pour pouvoir le modifier depuis partout
    private JLabel labelCompteur;

    public Ex02_BoutonsEtEvenements() {
        construireFenetre();
    }

    private void construireFenetre() {
        JFrame fenetre = new JFrame("Exemple 02 — Boutons et événements");
        fenetre.setSize(450, 200);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * FlowLayout dispose les composants les uns à la suite des autres,
         * comme des mots dans une phrase (gauche à droite, puis à la ligne).
         * Le paramètre CENTER centre chaque ligne.
         * Les deux derniers chiffres sont les marges horizontale et verticale entre composants.
         */
        fenetre.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));


        // --- Label qui affiche le compteur ---
        labelCompteur = new JLabel("Compteur : 0");
        // Personnaliser la police : nom de police, style (BOLD), taille
        labelCompteur.setFont(new Font("Arial", Font.BOLD, 22));
        fenetre.add(labelCompteur);


        // --- Bouton "Incrémenter" ---
        JButton boutonPlus = new JButton("+ Incrémenter");
        // Couleur de fond du bouton
        boutonPlus.setBackground(new Color(70, 160, 73));  // Vert
        // Couleur du texte
        boutonPlus.setForeground(Color.WHITE);
        // Rendre le fond opaque (nécessaire sur certains systèmes)
        boutonPlus.setOpaque(true);

        /*
         * ActionListener : interface fonctionnelle qui définit une seule méthode,
         * actionPerformed(), appelée à chaque clic sur le bouton.
         * On utilise ici une expression lambda (syntaxe courte de Java 8+).
         *
         * Équivalent "long" avec classe anonyme :
         *   boutonPlus.addActionListener(new ActionListener() {
         *       public void actionPerformed(ActionEvent e) { ... }
         *   });
         */
        boutonPlus.addActionListener(e -> {
            compteur++;                                          // Incrémenter la valeur
            labelCompteur.setText("Compteur : " + compteur);   // Mettre à jour l'affichage
        });

        fenetre.add(boutonPlus);


        // --- Bouton "Décrémenter" ---
        JButton boutonMoins = new JButton("− Décrémenter");
        boutonMoins.setBackground(new Color(200, 60, 50));  // Rouge
        boutonMoins.setForeground(Color.WHITE);
        boutonMoins.setOpaque(true);

        boutonMoins.addActionListener(e -> {
            compteur--;
            labelCompteur.setText("Compteur : " + compteur);
        });

        fenetre.add(boutonMoins);


        // --- Bouton "Réinitialiser" ---
        JButton boutonReset = new JButton("↺ Réinitialiser");
        boutonReset.setBackground(new Color(100, 100, 100));  // Gris
        boutonReset.setForeground(Color.WHITE);
        boutonReset.setOpaque(true);

        boutonReset.addActionListener(e -> {
            compteur = 0;
            labelCompteur.setText("Compteur : 0");
        });

        fenetre.add(boutonReset);


        fenetre.setVisible(true);
    }

    public static void main(String[] args) {
        // On instancie la classe, ce qui déclenche le constructeur et construit la fenêtre
        SwingUtilities.invokeLater(Ex02_BoutonsEtEvenements::new);
    }
}
