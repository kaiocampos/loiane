package com.kaiodev.aula15.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo: " + numero);
        } else {
            System.out.println("O número é negativo: " + numero);
        }
    }
}
