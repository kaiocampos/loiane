package com.kaiodev.aula13.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Entre com a velocidade da internet: ");
        double velocidadeInternet = scanner.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;
        System.out.println("o tempo de download é: " + tempo);


    }
}
