package com.swingtraining.examples.ex07;

/**
 * IMPLÉMENTATION 1 : sauvegarde au format JSON
 *
 * Cette classe "implémente" l'interface FormatSauvegarde.
 * Le mot-clé "implements" signifie qu'elle s'engage à fournir
 * toutes les méthodes déclarées dans l'interface.
 *
 * Si une méthode de l'interface manquait, le compilateur Java
 * refuserait de compiler cette classe — c'est la garantie du contrat.
 *
 * Exemple de sortie produite :
 * {
 *   "nom": "Dupont",
 *   "prenom": "Alice",
 *   "age": 30
 * }
 */
public class SauvegardeJSON implements FormatSauvegarde {

    /**
     * On indique au compilateur qu'on remplace (override) la méthode de l'interface.
     * C'est une bonne pratique : si on fait une faute de frappe dans le nom,
     * le compilateur nous prévient immédiatement.
     */
    @Override
    public String serialiser(Utilisateur utilisateur) {
        // Construction manuelle d'une chaîne JSON (sans bibliothèque externe)
        // En production, on utiliserait une lib comme Gson ou Jackson.
        return "{\n"
             + "  \"nom\": \""    + utilisateur.getNom()    + "\",\n"
             + "  \"prenom\": \"" + utilisateur.getPrenom() + "\",\n"
             + "  \"age\": "      + utilisateur.getAge()    + "\n"
             + "}";
    }

    @Override
    public String getNomFormat() {
        return "JSON";
    }
}
