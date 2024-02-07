package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (altura * 72.7) - 58;
        System.out.println("O seu peso ideal seria: "+ pesoIdeal);
    }
}
