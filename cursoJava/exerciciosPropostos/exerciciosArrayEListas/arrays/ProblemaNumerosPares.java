package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */
public class ProblemaNumerosPares {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite a quantidade de números que serão digitados: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        int quantidade=0;
        for (int i =0;i<n;i++){
            System.out.println("Digite o "+ (i+1)+"° número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Os números pares são: " );
        for (int i=0;i<n;i++){
            if (numeros[i]%2==0){
                System.out.print(numeros[i] +",");
                quantidade += 1;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares: "+ quantidade);

        sc.close();
    }
}
