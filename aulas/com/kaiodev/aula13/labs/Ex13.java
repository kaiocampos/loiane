package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o quanto você recebe por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite o quanto você trabalhou esse mês: ");
        double horaMes = scanner.nextDouble();

        double salarioBruto = valorHora * horaMes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
