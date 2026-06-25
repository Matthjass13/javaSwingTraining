package com.swingtraining.examples.ex07;

/**
 * Modèle simple représentant un utilisateur.
 *
 * Cette classe ne fait que stocker des données (nom, prénom, âge).
 * Elle n'a aucune responsabilité sur la façon dont ces données sont sauvegardées :
 * c'est le rôle de l'interface FormatSauvegarde et de ses implémentations.
 *
 * Ce découpage (données d'un côté, sauvegarde de l'autre) est un principe
 * fondamental de la conception orientée objet : la "séparation des responsabilités".
 */
public class Utilisateur {

    private String nom;
    private String prenom;
    private int age;

    public Utilisateur(String nom, String prenom, int age) {
        this.nom    = nom;
        this.prenom = prenom;
        this.age    = age;
    }

    // --- Getters ---
    // Des accesseurs simples en lecture seule (pas de setters ici, l'objet est immuable).

    public String getNom()    { return nom; }
    public String getPrenom() { return prenom; }
    public int    getAge()    { return age; }

    @Override
    public String toString() {
        return prenom + " " + nom + " (age: " + age + ")";
    }
}
