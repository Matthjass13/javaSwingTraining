package com.swingtraining.examples.ex07;

/**
 * IMPLÉMENTATION 2 : sauvegarde au format XML
 *
 * Exactement le même contrat que SauvegardeJSON, mais la sortie est différente.
 * Remarquez que la signature des méthodes est identique — seul le corps change.
 * C'est toute la puissance des interfaces : même interface, comportements différents.
 *
 * Exemple de sortie produite :
 * <utilisateur>
 *   <nom>Dupont</nom>
 *   <prenom>Alice</prenom>
 *   <age>30</age>
 * </utilisateur>
 */
public class SauvegardeXML implements FormatSauvegarde {

    @Override
    public String serialiser(Utilisateur utilisateur) {
        // Construction manuelle d'une chaîne XML (sans bibliothèque externe)
        return "<utilisateur>\n"
             + "  <nom>"    + utilisateur.getNom()    + "</nom>\n"
             + "  <prenom>" + utilisateur.getPrenom() + "</prenom>\n"
             + "  <age>"    + utilisateur.getAge()    + "</age>\n"
             + "</utilisateur>";
    }

    @Override
    public String getNomFormat() {
        return "XML";
    }
}
