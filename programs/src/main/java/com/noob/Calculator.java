package com.noob;

public class Calculator {

  int somme(double a, double b){
    return (int) (a + b);
  }
  int soustraction(double a, double b){
    return (int)(a-b);
  }
  int multiplication(double a, double b){
    return (int)(a*b);
  }
  int division(double a, double b){
    if (b == 0){
      System.out.println("Erreur: Division par zéro n'est pas autorisée.");
      return 0;
    }
    return (int)(a / b);
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator(); 
    System.out.println("SOMME");
    int resultat1 = calc.somme(5.5, 3.2);
    System.out.println("5.5 + 3.2 = " + resultat1);

    System.out.println("\nSOUSTRACTION");
    int resultat2 = calc.soustraction(5.5, 3.2);
    System.out.println("5.5 - 3.2 = " + resultat2);

    System.out.println("\nMULTIPLICATION");
    int resultat3 = calc.multiplication(5.5, 3.2);
    System.out.println("5.5 * 3.2 = " + resultat3);

    System.out.println("\nDIVISION");
    int resultat4 = calc.division(5.5, 3.2);
    System.out.println("5.5 / 3.2 = " + resultat4);

  }
}
