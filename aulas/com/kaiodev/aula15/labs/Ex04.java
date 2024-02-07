package com.kaiodev.aula15.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scanner.next();

//        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
//                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
//                letra.equalsIgnoreCase("u")) {
//            System.out.println("Essa letra é uma vogal!");
//        } else {
//            System.out.println("Essa letra é uma consoante!");
//        }

        if (letra.length() > 1) {
            System.out.println("não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Essa letra é uma vogal!");
                    break;
                default:
                    System.out.println("Essa letra é uma consoante");
                    break;
            }
        }
    }
}
