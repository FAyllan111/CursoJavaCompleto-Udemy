package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class ProblemaNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + "° número: ");
                numeros[i] = sc.nextInt();
            }
            System.out.println("Os números negativos são: ");
            for (int i = 0; i < n; i++) {
                if (numeros[i] < 0) {
                    System.out.print(numeros[i] + ",");
                }
            }
        } else {
            System.out.println("Erro!! Quantidade muito alta de números!!");
            sc.close();
        }
    }
}
