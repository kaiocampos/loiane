package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digit o segundo numero: ");
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;

        System.out.println("A soma dos números é: " + soma);
    }
}
