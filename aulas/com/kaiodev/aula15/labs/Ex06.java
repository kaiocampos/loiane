package com.kaiodev.aula15.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("O primeiro número é o maior: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("O segundo número é o maior: " + numero2);
        } else  {
            System.out.println("O terceiro número é o maior: " + numero3);
        }
    }
}
