package com.kaiodev.aula15.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media == 10)
        {
            System.out.println("Aprovado com DISTINÇÃO");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }
    }
}
