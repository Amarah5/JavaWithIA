package com.noob;

public class Presentation {
  public static void main(String[] args) {
      String[] monInfo = {"Mahery", "20", "Antananarivo"};
      /*for (String monInfo1 : monInfo) {
          switch (monInfo1) {
              case "Mahery" -> System.out.println("Je m'appelle " + monInfo[0]);
              case "20" -> System.out.println("J'ai " + monInfo[1]);
              case "Antananarivo" -> System.out.println("J'habite à  " + monInfo[2]);
          }
      }*/

      // Correction Chat:
      System.out.println("Je m'appelle " + monInfo[0]);
      System.out.println("J'ai " + monInfo[1] + " ans");
      System.out.println("J'habite à " + monInfo[2]);
  }
}
