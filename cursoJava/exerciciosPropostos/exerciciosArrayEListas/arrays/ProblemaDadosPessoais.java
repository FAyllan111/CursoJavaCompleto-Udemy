package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */


import java.util.Scanner;

public class ProblemaDadosPessoais {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];


        for (int i =0; i<n;i++){
            System.out.println("Digite a altura da "+(i+1) + "º pessoa: ");
            altura[i]=sc.nextDouble();
            System.out.println("Digite o gênero da " +(i+1) +"° pessoa: ");
            char validacao = sc.next().charAt(0);
            while (validacao != 'm' && validacao != 'f' && validacao != 'M' && validacao != 'F' ){
                System.out.println("Gênero inválido, digite novamente: ");
                validacao = sc.next().charAt(0);
            }
            genero[i]= validacao;
        }

        int homens =0;
        int mulheres =0;
        double altutaFeminina=0;
        for (int i =0;i<n;i++){
            if (genero[i] == 'M' || genero[i] == 'm'){
                homens++;
            }else {
                mulheres++;
                altutaFeminina += altura[i];
            }
        }

        double maiorAltura = altura[0];
        double menorAltura=altura[0];
        for (int i=1;i<n;i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i]<menorAltura){
                menorAltura = altura[i];
            }
        }

        double resultado= altutaFeminina/mulheres;
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A maior altura e: " + maiorAltura);
        System.out.println("A média das alturas das mulheres é de: "+ resultado);
        System.out.println("A quantidade de homens é de: " + homens);
        sc.close();
    }
}
