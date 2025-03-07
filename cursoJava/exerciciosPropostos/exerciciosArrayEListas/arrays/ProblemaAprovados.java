package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
public class ProblemaAprovados {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] notasUm = new double[n];
        double[] notasDois = new double[n];
        double[] resultado = new double[n];

        for (int i =0; i<n;i++){
            System.out.println("Digite os dados do " + (i+1) + "° aluno: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Nota do 1° semestre: ");
            notasUm[i] = sc.nextDouble();
            System.out.println("Nota do 2º semestre: ");
            notasDois[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i =0;i<n;i++){
            resultado[i] = (notasUm[i]+notasDois[i])/2;
            if (resultado[i] >= 6.0){
                System.out.println(nomes[i]);
            }
        }



        sc.close();
    }
}
