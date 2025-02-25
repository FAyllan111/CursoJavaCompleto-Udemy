package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.test;

import cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.println("Digite os dados do funcionário: ");
        System.out.println("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.println("Salário: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.tax = sc.nextDouble();

        funcionario.result();

        System.out.println("Digite a alteração do salário: ");
        funcionario.percentage = sc.nextDouble();
        funcionario.increaseSalary(funcionario.percentage);
        funcionario.result();


        sc.close();
    }
}
