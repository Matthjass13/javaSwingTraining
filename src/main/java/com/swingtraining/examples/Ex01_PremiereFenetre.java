package com.swingtraining.examples;

// On importe les classes Swing nécessaires
import javax.swing.JFrame;   // La fenêtre principale
import javax.swing.JLabel;   // Un composant pour afficher du texte
import javax.swing.SwingUtilities; // Utilitaire pour gérer le thread d'interface

/**
 * EXEMPLE 01 — Créer une première fenêtre avec Java Swing
 *
 * Concepts abordés :
 *  - Créer un JFrame (la fenêtre)
 *  - Ajouter un JLabel (du texte)
 *  - Configurer la taille, le titre et le comportement de fermeture
 *  - Rendre la fenêtre visible
 *  - Utiliser SwingUtilities.invokeLater (bonne pratique)
 */
public class Ex01_PremiereFenetre {

    public static void main(String[] args) {

        /*
         * BONNE PRATIQUE : toute création ou modification de composants Swing
         * doit se faire sur le "Event Dispatch Thread" (EDT), le thread dédié
         * à l'interface graphique. invokeLater() garantit cela.
         */
        SwingUtilities.invokeLater(() -> {
            creerEtAfficherFenetre();
        });
    }

    private static void creerEtAfficherFenetre() {

        // --- 1. Créer la fenêtre (JFrame) ---
        // JFrame est le composant racine : c'est la vraie fenêtre du système d'exploitation.
        JFrame fenetre = new JFrame();

        // Définir le titre de la fenêtre (affiché dans la barre de titre)
        fenetre.setTitle("Ma première fenêtre Swing !");

        // Définir la taille en pixels : largeur x hauteur
        fenetre.setSize(400, 300);

        // Centrer la fenêtre sur l'écran (null = relatif à l'écran entier)
        fenetre.setLocationRelativeTo(null);

        /*
         * Que faire quand l'utilisateur clique sur la croix (fermer) ?
         * EXIT_ON_CLOSE = quitter le programme Java complètement.
         * Autres options : HIDE_ON_CLOSE (cacher), DISPOSE_ON_CLOSE (détruire), DO_NOTHING_ON_CLOSE.
         */
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // --- 2. Ajouter un label (texte) ---
        // JLabel affiche du texte (ou une image) non interactif.
        // On peut utiliser du HTML basique pour la mise en forme.
        JLabel label = new JLabel("<html><center>Bonjour, Swing !<br>C'est ma première fenêtre.</center></html>");

        // Centrer le texte horizontalement dans le label
        label.setHorizontalAlignment(JLabel.CENTER);

        /*
         * add() ajoute le composant au "content pane" de la fenêtre.
         * Par défaut, le layout est BorderLayout : sans préciser de position,
         * le composant occupe toute la zone centrale.
         */
        fenetre.add(label);


        // --- 3. Afficher la fenêtre ---
        // IMPORTANT : appeler setVisible(true) EN DERNIER, après avoir tout configuré.
        fenetre.setVisible(true);
    }
}
