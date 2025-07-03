package com.noob;

import java.util.ArrayList;
import java.util.Arrays;

public class Moyenne {
  public static void main(String[] args) {
    ArrayList<Double> notes = new ArrayList<>(Arrays.asList(2.0, 9.0, 18.0)); 
    double moyenne = notes.stream().mapToDouble(Double::doubleValue)
                      .average().orElse(0.0);
    System.out.println("Votre moyenne est: " + (float) moyenne);
  }
}
