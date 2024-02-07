package com.kaiodev.aula15.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: F ou M");
        String letra = scanner.next();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("O sexo é Feminino. ");
        } else if(letra.equalsIgnoreCase("M")){
            System.out.println("O sexo é Masculino. ");
        }else {
            System.out.println("O sexo é Inválido: " + letra);
        }

    }
}
