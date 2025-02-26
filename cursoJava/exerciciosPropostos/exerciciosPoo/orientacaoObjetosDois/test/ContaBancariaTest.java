package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetosDois.test;

import cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetosDois.domain.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados da conta");
        System.out.println("Digite o nome do titular: ");
        String nome = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Deseja realizar o depósito inicial? (S/N) ");
        char validacaoDepositoInicial = sc.next().charAt(0);
        double depositoInicial;
        if (validacaoDepositoInicial == 's'){
            System.out.println("Digite o valor do depósito: ");
            depositoInicial = sc.nextDouble();
        }else {
            depositoInicial = 0;
        }

        ContaBancaria conta2= new ContaBancaria(numeroConta,nome);
        conta2.depositar(depositoInicial);
        conta2.apresentar();

        System.out.println("Digite o valor a ser depositado: ");
        depositoInicial = sc.nextDouble();
        conta2.depositar(depositoInicial);
        conta2.apresentar();

        System.out.println("Digite o valor a ser sacado: ");
        depositoInicial = sc.nextDouble();
        conta2.sacar(depositoInicial);
        conta2.apresentar();


    }
}
