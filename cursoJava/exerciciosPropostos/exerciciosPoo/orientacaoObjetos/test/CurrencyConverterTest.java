package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.test;

import cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain.CurencyConverter;

import java.util.Scanner;

/*
Faça um programa para ler a cotação do dólar e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar em dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurencyConverter para ser responsável pelos cálculos

Ex:
entrada - 3.10 (preço do dólar)
entrada 200.00 (quantos dólares quer comprar)
saída 657,20 (valor a ser pago em reais)
 */

public class CurrencyConverterTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o valor do dolar: ");
        double valorDolar = sc.nextDouble();
        System.out.println("Digite a quantidade de dolar a ser comprada: ");
        double quantidadeDolar = sc.nextDouble();
        double valorConvertido = CurencyConverter.converter(valorDolar,quantidadeDolar);
        System.out.printf("O valor que deverá ser pago é de: %.2f%n",valorConvertido );

    }
}
