package com.swingtraining.examples;

import javax.swing.*;
import java.awt.*;

/**
 * EXEMPLE 03 — Navigation entre plusieurs écrans (CardLayout)
 *
 * Concepts abordés :
 *  - CardLayout : un gestionnaire de mise en page qui empile des "cartes" (panels)
 *    et n'en affiche qu'une seule à la fois — idéal pour simuler des "pages".
 *  - JPanel : conteneur générique pour grouper des composants
 *  - Passer des données d'un écran à l'autre
 *  - Structurer son code en méthodes (une méthode = un écran)
 *
 * Architecture :
 *   JFrame
 *   └── conteneurPrincipal (CardLayout)
 *       ├── "ACCUEIL"     → panelAccueil()
 *       ├── "FORMULAIRE"  → panelFormulaire()
 *       └── "RESULTAT"    → panelResultat()
 */
public class Ex03_NavigationEntreEcrans {

    // CardLayout gère l'empilement et l'affichage des cartes
    private CardLayout cardLayout;

    // Le panel qui contient toutes les cartes (il est géré par cardLayout)
    private JPanel conteneurPrincipal;

    // Champ de saisie déclaré ici pour y accéder depuis plusieurs écrans
    private JTextField champPrenom;

    // Label du résultat, mis à jour dynamiquement
    private JLabel labelResultat;

    public Ex03_NavigationEntreEcrans() {
        construireFenetre();
    }

    private void construireFenetre() {
        JFrame fenetre = new JFrame("Exemple 03 — Navigation entre écrans");
        fenetre.setSize(500, 350);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer le CardLayout et le panel principal
        cardLayout = new CardLayout();
        conteneurPrincipal = new JPanel(cardLayout);

        /*
         * On ajoute chaque "carte" (panel) avec une clé (String).
         * La clé permet de naviguer vers cette carte avec cardLayout.show().
         */
        conteneurPrincipal.add(creerPanelAccueil(),    "ACCUEIL");
        conteneurPrincipal.add(creerPanelFormulaire(), "FORMULAIRE");
        conteneurPrincipal.add(creerPanelResultat(),   "RESULTAT");

        // La première carte affichée est toujours la première ajoutée (ACCUEIL)
        fenetre.add(conteneurPrincipal);
        fenetre.setVisible(true);
    }


    // =========================================================================
    // ÉCRAN 1 : Accueil
    // =========================================================================

    private JPanel creerPanelAccueil() {
        /*
         * BoxLayout(panel, BoxLayout.Y_AXIS) empile les composants
         * verticalement, du haut vers le bas.
         */
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(230, 240, 255));

        // Marge interne du panel (haut, gauche, bas, droite) en pixels
        panel.setBorder(BorderFactory.createEmptyBorder(60, 40, 40, 40));

        JLabel titre = new JLabel("🏠 Écran d'accueil");
        titre.setFont(new Font("Arial", Font.BOLD, 24));
        titre.setAlignmentX(Component.CENTER_ALIGNMENT);  // Centrer horizontalement dans BoxLayout

        JLabel sousTitre = new JLabel("Bienvenue dans l'exemple de navigation !");
        sousTitre.setFont(new Font("Arial", Font.PLAIN, 14));
        sousTitre.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Espace vertical entre les composants (invisible, juste du vide)
        Box.Filler espaceur = (Box.Filler) Box.createVerticalStrut(30);

        JButton boutonSuivant = new JButton("Aller au formulaire →");
        boutonSuivant.setAlignmentX(Component.CENTER_ALIGNMENT);
        boutonSuivant.setFont(new Font("Arial", Font.BOLD, 14));

        // Au clic : afficher la carte "FORMULAIRE"
        boutonSuivant.addActionListener(e -> cardLayout.show(conteneurPrincipal, "FORMULAIRE"));

        panel.add(titre);
        panel.add(Box.createVerticalStrut(10));  // Petit espace
        panel.add(sousTitre);
        panel.add(espaceur);
        panel.add(boutonSuivant);

        return panel;
    }


    // =========================================================================
    // ÉCRAN 2 : Formulaire de saisie
    // =========================================================================

    private JPanel creerPanelFormulaire() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255, 250, 230));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));

        JLabel titre = new JLabel("📝 Formulaire");
        titre.setFont(new Font("Arial", Font.BOLD, 20));
        titre.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel instruction = new JLabel("Entrez votre prénom :");
        instruction.setFont(new Font("Arial", Font.PLAIN, 14));
        instruction.setAlignmentX(Component.CENTER_ALIGNMENT);

        /*
         * JTextField est un champ de saisie de texte sur une seule ligne.
         * Le chiffre 20 indique la largeur approximative en nombre de caractères.
         */
        champPrenom = new JTextField(20);
        champPrenom.setMaximumSize(new Dimension(300, 35));  // Taille max dans BoxLayout
        champPrenom.setFont(new Font("Arial", Font.PLAIN, 14));

        // Panel horizontal pour les boutons (FlowLayout par défaut)
        JPanel panelBoutons = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        panelBoutons.setOpaque(false);  // Transparent pour voir le fond du panel parent

        JButton boutonRetour = new JButton("← Retour");
        boutonRetour.addActionListener(e -> cardLayout.show(conteneurPrincipal, "ACCUEIL"));

        JButton boutonValider = new JButton("Valider ✓");
        boutonValider.setBackground(new Color(50, 150, 50));
        boutonValider.setForeground(Color.WHITE);
        boutonValider.setOpaque(true);

        boutonValider.addActionListener(e -> {
            String prenom = champPrenom.getText().trim();  // .trim() enlève les espaces en début/fin

            if (prenom.isEmpty()) {
                // Afficher un message d'erreur dans une boîte de dialogue modale
                JOptionPane.showMessageDialog(
                    null,                               // null = centré sur l'écran
                    "Veuillez entrer votre prénom !",   // Message
                    "Champ requis",                     // Titre de la boîte
                    JOptionPane.WARNING_MESSAGE         // Icône d'avertissement
                );
                return; // Arrêter ici, ne pas naviguer
            }

            // Mettre à jour le label de l'écran résultat avant de l'afficher
            labelResultat.setText("Bonjour, " + prenom + " ! 👋");
            cardLayout.show(conteneurPrincipal, "RESULTAT");
        });

        panelBoutons.add(boutonRetour);
        panelBoutons.add(boutonValider);

        panel.add(titre);
        panel.add(Box.createVerticalStrut(20));
        panel.add(instruction);
        panel.add(Box.createVerticalStrut(10));
        panel.add(champPrenom);
        panel.add(Box.createVerticalStrut(25));
        panel.add(panelBoutons);

        return panel;
    }


    // =========================================================================
    // ÉCRAN 3 : Résultat
    // =========================================================================

    private JPanel creerPanelResultat() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(230, 255, 235));
        panel.setBorder(BorderFactory.createEmptyBorder(60, 40, 40, 40));

        JLabel titre = new JLabel("✅ Résultat");
        titre.setFont(new Font("Arial", Font.BOLD, 20));
        titre.setAlignmentX(Component.CENTER_ALIGNMENT);

        // labelResultat sera mis à jour dynamiquement lors de la validation
        labelResultat = new JLabel("...");
        labelResultat.setFont(new Font("Arial", Font.BOLD, 26));
        labelResultat.setForeground(new Color(30, 120, 30));
        labelResultat.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton boutonRecommencer = new JButton("↺ Recommencer depuis le début");
        boutonRecommencer.setAlignmentX(Component.CENTER_ALIGNMENT);
        boutonRecommencer.addActionListener(e -> {
            champPrenom.setText("");                            // Vider le champ de saisie
            cardLayout.show(conteneurPrincipal, "ACCUEIL");    // Retourner à l'accueil
        });

        panel.add(titre);
        panel.add(Box.createVerticalStrut(30));
        panel.add(labelResultat);
        panel.add(Box.createVerticalStrut(40));
        panel.add(boutonRecommencer);

        return panel;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex03_NavigationEntreEcrans::new);
    }
}
