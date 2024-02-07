package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = scanner.nextDouble();

        double celcius = (5 * (farenheit - 32) / 9);

        System.out.println(farenheit+ " em Farenheit equivale a "+celcius+" celcius");

    }
}
