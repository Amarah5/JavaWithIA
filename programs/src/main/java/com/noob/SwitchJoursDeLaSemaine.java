package com.noob;

public class SwitchJoursDeLaSemaine {
  public static void main(String[] args) {
    int jour = 7;

    String nomDuJour = switch (jour) {
      case 1 -> "Lundi";
      case 2 -> "Mardi";
      case 3 -> "Mercredi";
      case 4 -> "Jeudi";
      case 5 -> "Vendredi";
      case 6 -> "Samedi";
      case 7 -> "Dimanche";
      default -> "Jour invalide";
    };
    System.out.println(nomDuJour);
  }
}