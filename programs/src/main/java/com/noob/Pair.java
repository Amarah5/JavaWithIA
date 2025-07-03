package com.noob;

public class Pair {

  public static void main(String[] args) {
      int a = 10;
      int b = 2;
      System.out.println("le reste de la division de: "+a+" par: "+b+" est: " + a%b);
      if((a%b)/2 == 0){
        System.out.println("le reste de la division de: "+a+" par: "+b+" est un nombre paire");
      }else{
        System.out.println("le reste de la division de: "+a+" par: "+b+" est un nombre impaire");
      }
  }

}
