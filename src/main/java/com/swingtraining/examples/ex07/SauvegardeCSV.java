package com.swingtraining.examples.ex07;

/**
 * IMPLÉMENTATION 3 : sauvegarde au format CSV (Comma-Separated Values)
 *
 * Troisième implémentation de la même interface.
 * Le CSV est un format tabulaire lisible par Excel ou LibreOffice Calc.
 *
 * Exemple de sortie produite :
 * nom,prenom,age
 * Dupont,Alice,30
 */
public class SauvegardeCSV implements FormatSauvegarde {

    @Override
    public String serialiser(Utilisateur utilisateur) {
        // Ligne d'en-tête + ligne de données, séparées par des virgules
        return "nom,prenom,age\n"
             + utilisateur.getNom()    + ","
             + utilisateur.getPrenom() + ","
             + utilisateur.getAge();
    }

    @Override
    public String getExtension() {
        return ".csv";
    }

    @Override
    public String getNomFormat() {
        return "CSV";
    }
}
