package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média das notas é: " + media);
    }
}
