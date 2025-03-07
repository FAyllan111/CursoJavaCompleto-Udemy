package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */
public class ProblemaSomaVetores {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Quantos elementos vai ter cada vetor? ");
        int n= sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new  int[n];
        int[] vetorResultante = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0;i<n;i++){
            System.out.println("Digite o "+ (i+1) +"° elemento: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0;i<n;i++){
            System.out.println("Digite o "+ (i+1) +"° elemento: ");
            vetorB[i]= sc.nextInt();
        }

        System.out.println("Resultado da soma dos vetores: ");
        for (int i=0;i<n;i++){
            vetorResultante[i] = vetorA[i] + vetorB[i];
            System.out.println("A soma dos " + (i+1) + "° elementos é: " + vetorResultante[i]);
        }

        sc.close();
    }
}
