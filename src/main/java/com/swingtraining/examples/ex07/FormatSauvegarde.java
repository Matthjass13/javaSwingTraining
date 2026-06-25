package com.swingtraining.examples.ex07;

import java.io.IOException;
import java.nio.file.Path;

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
     * Écrit le contenu sérialisé dans un fichier sur le disque.
     *
     * Cette méthode est une "méthode par défaut" (default method), introduite
     * en Java 8. Elle fournit une implémentation directement dans l'interface,
     * que toutes les classes héritent SANS avoir à la redéfinir.
     *
     * Avantage : les trois classes (JSON, XML, CSV) n'ont pas besoin de
     * répéter ce code identique. Si on veut changer la logique d'écriture
     * (ex: ajouter des logs), on ne modifie qu'un seul endroit.
     *
     * @param utilisateur L'objet à sauvegarder
     * @param destination Le chemin du fichier à créer ou écraser
     * @throws IOException Si une erreur survient lors de l'écriture
     */
    default void sauvegarderFichier(Utilisateur utilisateur, Path destination) throws IOException {
        // On délègue la sérialisation à la méthode abstraite serialiser(),
        // puis on écrit le résultat dans le fichier en une seule instruction.
        java.nio.file.Files.writeString(destination, serialiser(utilisateur));
    }

    /**
     * Retourne l'extension de fichier associée à ce format.
     * Utilisée pour pré-remplir le nom de fichier dans le JFileChooser.
     *
     * @return Par exemple ".json", ".xml", ".csv"
     */
    String getExtension();

    /**
     * Retourne le nom lisible du format (utilisé pour l'affichage dans l'UI).
     *
     * @return Par exemple "JSON", "XML", "CSV"
     */
    String getNomFormat();
}
