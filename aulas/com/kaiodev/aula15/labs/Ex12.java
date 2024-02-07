package com.kaiodev.aula15.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você recebe por hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas trabalhou esse mês:");
        double horaMes = scan.nextDouble();

        double salarioBruto = valorHora * horaMes;
        double irPercentual = 0;
        double inss = (salarioBruto * 10) /100;
        double fgts = (salarioBruto * 11) /100;


        if (salarioBruto <= 900){
            irPercentual = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            irPercentual = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            irPercentual = 10;
        } else if (salarioBruto > 2500){
            irPercentual = 20;
        }

        double irDesconto = (irPercentual * salarioBruto) /100;
        double totalDescontos = inss+ irDesconto;

        System.out.println("Salário bruto (" + valorHora + " * " + horaMes + ")    : R$ " + salarioBruto );
        System.out.println("(-)  IR ("+ irDesconto+ "%) : R$ " + irDesconto);
        System.out.println("(-)  INSS (10%)     : R$ " + inss);
        System.out.println("(-)  FGTS (11%)     : R$ " + fgts);
        System.out.println("Total de descontos     : R$ " + totalDescontos);
        System.out.println("Salário liquido     : R$ " + (salarioBruto - totalDescontos));



    }
}
