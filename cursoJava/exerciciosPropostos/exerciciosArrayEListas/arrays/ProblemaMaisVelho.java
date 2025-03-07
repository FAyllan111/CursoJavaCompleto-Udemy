package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */
public class ProblemaMaisVelho {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite quantas pessoas serão inseridas: ");
        int n = sc.nextInt();
        int maiorIdade,posicaoMaior;
        String[] nomes = new String[n];
        int[] idades = new int[n];


        for (int i =0;i<n;i++){
            System.out.printf("Digite os dados da %da pessoa:\n",i+1);
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaior =0;

        for (int i=0;i<n;i++){
            if (idades[i]>maiorIdade){
                maiorIdade = idades[i];
                posicaoMaior =i;
            }
        }

        System.out.println("A pessoa mais velha é: " + nomes[posicaoMaior]);

        sc.close();
    }
}
