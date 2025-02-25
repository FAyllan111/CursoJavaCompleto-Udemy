package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.test;

import cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Student alunoUm = new Student();
        Student alunoDois = new Student();

        System.out.println("Digite os dados do aluno");
        System.out.println("Nome: ");
        alunoUm.name = sc.nextLine();
        System.out.println("Digite as notas abaixo");
        System.out.println();
        System.out.println("Digite a nota do 1° trimestre: ");
        alunoUm.firstQuarter = sc.nextDouble();
        System.out.println("Digite a nota do 2° trimestre: ");
        alunoUm.secondQuarter = sc.nextDouble();
        System.out.println("Digite a nota do 3° trimestre: ");
        alunoUm.thirdQuarter = sc.nextDouble();

        alunoUm.result();

        System.out.println("-------------------------------");
        System.out.println("Digite os dados do aluno");
        System.out.println("Nome: ");
        alunoDois.name = sc.nextLine();
        System.out.println("* Digite as notas abaixo* ");
        System.out.println();
        System.out.println("Digite a nota do 1° trimestre: ");
        alunoDois.firstQuarter = sc.nextDouble();
        System.out.println("Digite a nota do 2° trimestre: ");
        alunoDois.secondQuarter = sc.nextDouble();
        System.out.println("Digite a nota do 3° trimestre: ");
        alunoDois.thirdQuarter = sc.nextDouble();

        alunoDois.result();

        sc.close();
    }
}
