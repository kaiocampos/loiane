package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.println("A area do quadrado é: "+ area);
        System.out.println("O dobro da area do quadrado é: "+ area *2);

    }
}
