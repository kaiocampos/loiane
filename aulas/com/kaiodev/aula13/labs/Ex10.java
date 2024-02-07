package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double celsius = scanner.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.println(celsius+ " em Farenheit equivale a "+farenheit+" celcius");

    }
}
