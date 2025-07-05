package com.noob;

public class ClassificationCouleur {
  public static void main(String[] args) {
    String couleur = "blanche"; 
    String typeDeCouleur;

    switch (couleur.toLowerCase()) { 
      case "rouge", "bleu", "jaune" -> typeDeCouleur = "primaire";
      case "vert", "orange", "violet" -> typeDeCouleur = "secondaire";
      default -> typeDeCouleur = "inconnue";
    }

    System.out.println("La couleur " + couleur + " est une couleur " + typeDeCouleur + ".");
  }
}
