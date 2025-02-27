package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
public class ProblemaMediaPares {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite quantos elementos terá o vetor: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Digite o "+(i+1) +"° número:");
            numeros[i]= sc.nextInt();
        }

        double soma =0;
        int quantidadePares=0;
        for (int i=0;i<n;i++){
            if(numeros[i]%2 ==0){
                soma+=numeros[i];
                quantidadePares++;
            }
        }
        double media = soma / quantidadePares;
        if (quantidadePares > 0){
            System.out.println("A média dos números pares é: " + media);
        }else {
            System.out.println("Não existem números pares. ");
        }


        sc.close();
    }
}
