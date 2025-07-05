package com.noob;

public class OperateurTernaire {
  public static void main(String[] args) {
      int nombre = 3;
     String status = (nombre%2 == 0) ? "Pair" : "Impair";
     System.out.println(status);
  }
}
