package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */
public class ProblemaMaiorPosicao {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite a quantidade de números que serão digitados: ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i=0;i<n;i++){
            System.out.println("Digite o "+ (i+1) +"° número: ");
            numeros[i]=sc.nextDouble();
        }

        double maior = numeros[0];
        int posicaoMaior=0;

        for (int i =0;i<n;i++){
            if (numeros[i]>maior){
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("O maior valor é: "+ maior);
        System.out.println("E a posição do maior valor é: " + posicaoMaior);


        sc.close();
    }
}
