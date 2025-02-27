package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */
public class ProblemaSomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Os valores digitados são: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]+",");
        }
        double soma =0.0;
        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println();
        System.out.printf("A soma dos números é: %.2f\n ",soma);
        System.out.printf("E a média é: %.2f\n " , media);


        sc.close();
    }
}
