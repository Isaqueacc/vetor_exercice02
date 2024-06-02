package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas pessoas serão digitadas ?: ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("dados da " + (i+1)+ " pessoa");
            System.out.println("nome: ");
            nome[i] = sc.next();
            System.out.println("idade: ");
            idade[i] = sc.nextInt();
            System.out.println("altura: ");
            altura[i] = sc.nextDouble();
        }
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            soma = soma + altura[i];
        }
        double resultado = soma/n;
        System.out.printf("Altura media: %.2f%n", resultado);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                cont = cont + 1;
            }
        }
        double porcentagem = cont * 100.0/n;
        System.out.printf("pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        for (int i = 0; i < n; i++) {
            if (idade[i]< 16){
                System.out.println(nome[i]);

            }
        }
        sc.close();
    }
}
