package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");
        double metros = scanner.nextDouble();
        double centimetro = metros * 100;

        System.out.println(metros + " Equivale a " + centimetro + " centimetros");

    }
}
