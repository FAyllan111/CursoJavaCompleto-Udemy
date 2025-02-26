package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetosDois.test;

import cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetosDois.domain.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {

        double movimentacoesContaDeposito,movimentacoesContaSaque;
        Scanner sc = new Scanner(System.in);
        System.out.println("*Digite os dados da conta*");
        System.out.println("Digite o nome do titular: ");
        String nome = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Deseja realizar o depósito inicial? (S/N) ");
        char validacaoDepositoInicial = sc.next().charAt(0);
        double depositoInicial;
        if (validacaoDepositoInicial == 's'){
            System.out.println("Digite o valor do depósito inicial: ");
            depositoInicial = sc.nextDouble();
        }else {
            depositoInicial = 0;
        }

        ContaBancaria conta= new ContaBancaria(numeroConta,nome,depositoInicial);
        conta.apresentar();
        System.out.println("----------------");

        System.out.println("Digite o valor a ser depositado: ");
        movimentacoesContaDeposito = sc.nextDouble();
        conta.depositar(movimentacoesContaDeposito);
        System.out.println("Atualização da conta: ");
        conta.apresentar();

        System.out.println("Digite o valor a ser sacado: ");
        movimentacoesContaSaque = sc.nextDouble();
        conta.sacar(movimentacoesContaSaque);
        System.out.println("Atualização da conta: ");
        conta.apresentar();


    }
}
