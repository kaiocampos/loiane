package com.kaiodev.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
      System.out.println("Digite a sua frase: ");
        String frase = scanner.nextLine();
        System.out.println("Bonita frase: " + frase);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
       System.out.println("Bonito nome: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Bonita idade: " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Bonita altura: " + altura);
*/
        System.out.println("Digite seu nome, idade, altura, filhos: ");
        String primeiroNome = scanner.next();
        int idade = scanner.nextInt();
        double altura = scanner.nextDouble();
        boolean isFilhos = scanner.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " +primeiroNome);
        System.out.println("Idade: " +idade);
        System.out.println("altura: " +altura);
        System.out.println("Se tem filhos: " +isFilhos);


    }
}




