package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite um outro número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        int a = (numero1 * 2) * (numero2 / 2);
        double b = (numero1 * 3) + numeroReal;
        double c = Math.pow(numeroReal, 3);

        System.out.println("O produto do  primeiro com metade do segundo: " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro " + b);
        System.out.println("o terceiro elevado ao cubo " + c);

    }
}
