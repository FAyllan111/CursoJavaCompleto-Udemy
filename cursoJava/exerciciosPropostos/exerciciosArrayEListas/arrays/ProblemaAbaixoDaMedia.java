package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;
/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

import java.util.Scanner;

public class ProblemaAbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        for (int i=0;i<n;i++){
            System.out.println("Digite o " +(i+1)+"° número: ");
            numeros[i] =sc.nextDouble();
        }

        double soma =0;
        for (int i =0;i<n;i++){
            soma+= numeros[i];
        }
        double media= soma/ numeros.length;
        System.out.println("A média do vetor é: " + media);
        System.out.println("Elementos abaixo da média: ");
        for (int i =0;i<n;i++){
            if (numeros[i]<media){
                System.out.print(numeros[i]+",");
            }
        }

        sc.close();
    }
}
