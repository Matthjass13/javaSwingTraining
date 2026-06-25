package com.swingtraining.examples.ex07;

/**
 * INTERFACE : FormatSauvegarde
 *
 * C'est le coeur de cet exercice. Une interface définit un CONTRAT :
 * elle dit "toute classe qui m'implémente DOIT fournir ces méthodes".
 *
 * Ici, le contrat est simple : savoir convertir un Utilisateur en texte
 * et retourner le nom du format pour l'affichage.
 *
 * AVANTAGE CLÉ :
 * Le code Swing (l'interface graphique) n'a pas besoin de savoir
 * si on utilise JSON, XML ou CSV. Il appelle toujours la même méthode
 * "serialiser()" sur une variable de type FormatSauvegarde.
 * Pour changer de format, on change juste l'implémentation utilisée —
 * le reste du code ne bouge pas. C'est le principe "Ouvert/Fermé".
 *
 * IMPLÉMENTATIONS disponibles dans ce package :
 *  - SauvegardeJSON  → produit du JSON
 *  - SauvegardeXML   → produit du XML
 *  - SauvegardeCSV   → produit du CSV
 */
public interface FormatSauvegarde {

    /**
     * Convertit un utilisateur en texte selon le format choisi.
     *
     * @param utilisateur L'objet à sérialiser
     * @return Une chaîne de caractères représentant l'utilisateur dans ce format
     */
    String serialiser(Utilisateur utilisateur);

    /**
     * Retourne le nom lisible du format (utilisé pour l'affichage dans l'UI).
     *
     * @return Par exemple "JSON", "XML", "CSV"
     */
    String getNomFormat();
}
