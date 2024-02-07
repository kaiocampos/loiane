package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o quanto você recebe por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite o quanto você trabalhou esse mês: ");
        double horaMes = scanner.nextDouble();

        double salario = valorHora * horaMes;
        System.out.println("Você deverá receber esse mês: " + salario);
    }
}
