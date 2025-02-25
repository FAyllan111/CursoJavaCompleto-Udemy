package cursoJava.exerciciosPropostos.exerciciosNivelamento;

import java.util.Scanner;

public class ExerciciosPropostosDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroUm, numeroDois;

        System.out.println("______________E1:__________");
        /* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */
        System.out.println("Digite um número inteiro:");
        numeroUm = sc.nextDouble();
        if (numeroUm >0){
            System.out.println("O número digitado é positivo ");
        }else {
            System.out.println("O número digitado é negativo");
        }



        System.out.println("______________E2:__________");
        /*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
        System.out.println("Digite um número inteiro");
        numeroUm = sc.nextDouble();
        double parImpar;
        parImpar = numeroUm % 2 ;


        if (parImpar == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");
        }


        System.out.println("______________E3:__________");
        /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao são Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. */
        System.out.println("Digite os numeros em ordem decrescente");
        System.out.println("Digite o primeiro número: ");
        numeroUm = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        numeroDois = sc.nextDouble();

        double numerosMultiplos;

        numerosMultiplos = (numeroUm / numeroDois) * numeroDois;

        if (numerosMultiplos == numeroUm ){
            System.out.println("Os números são múltiplos");
        }else {
            System.out.println("Os números não são múltiplos");
        }


        System.out.println("______________E4:__________");
        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
        System.out.println("Digite o horário de inicio do jogo: ");
        numeroUm = sc.nextDouble();
        System.out.println("Digite o horário de finalização do jogo: ");
        numeroDois = sc.nextDouble();

        double duracaoJogo = numeroDois - numeroUm;


        if (duracaoJogo== 0 || duracaoJogo ==24){
            System.out.println(" O jogo durou 24 horas");
        }else {
            System.out.println("O jogo durou " + duracaoJogo + " horas");
        }

        System.out.println("______________E5:__________");
        /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade este item. A seguir, calcule e mostre o valor da conta a pagar.

            Codigo  |    Especificação          | Preço
            1   	|  Cachorro Quente          |  R$4,00
            2   	|          x-salada	        |  R$ 4,50
            3   	|	x-bacon                 |  R$ 5,00
            4   	|  Torrada simples          |  R$ 2,00
            5   	|    Refrigerante           |  R$ 1,50 */

        System.out.println("Digite o código do produto: ");
        numeroUm = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        numeroDois = sc.nextDouble();

        if (numeroUm == 1){
            System.out.println("O valor total foi de: R$" + numeroDois * 4.00);
        } else if (numeroUm == 2) {
            System.out.println("O valor total foi de: R$" + numeroDois * 4.50);
        } else if (numeroUm == 3) {
            System.out.println("O valor total foi de: R$" + numeroDois * 5.00);
        }else if (numeroUm == 4){
            System.out.println("O valor total foi de: R$" + numeroDois * 2.00);
        } else if (numeroUm == 5) {
            System.out.println("O valor total foi de: R$" + numeroDois * 1.50);
        }else {
            System.out.println("Digite um código válido");
        }

        System.out.println("______________E6:__________");
        /* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */
        System.out.println("Digite o valor");
        numeroUm = sc.nextDouble();



        if (numeroUm >= 0 && numeroUm <= 25){
            System.out.println("O número está no intervalo de 0 a 25");
        } else if (numeroUm > 25 && numeroUm <=50 ) {
            System.out.println("O número está no intervalo de 0 a 25");
        } else if (numeroUm > 50 && numeroUm <= 75) {
            System.out.println("O número está no intervalo de 0 a 25");
        }else if (numeroUm > 75 && numeroUm <=100){
            System.out.println("O número está no intervalo de 0 a 25");
        }else{
            System.out.println("O número está fora do intervalo ");
        }


        System.out.println("______________E7:__________");
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. */

        System.out.println("Digite o valor da coordenada X: ");
        numeroUm = sc.nextDouble();
        System.out.println("Digite o valor da coordenada Y: ");
        numeroDois = sc.nextDouble();

        if(numeroUm == 0.0 && numeroDois == 0.0){
            System.out.println("A coordenada se encontra na origem");
        }else if (numeroUm == 0 ){
            System.out.println("O valor está sobre o eixo X");
        } else if (numeroDois ==0) {
            System.out.println("O valor está sobre o eixo Y");
        } else if (numeroUm > 0 && numeroDois > 0) {
            System.out.println("O valor está no primeiro quadrante");
        } else if (numeroUm < 0 && numeroDois > 0) {
            System.out.println("O valor está no segundo quadrante");
        } else if (numeroUm < 0 && numeroDois < 0) {
            System.out.println("O valor está no terceiro quadrante");
        }else {
            System.out.println("O valor esá no quarto quadrante");
        }

        System.out.println("______________E8:__________");
        /* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

        Renda		 		        	| IR
        De R$ 0,00 a R$ 2000,00	 	    | Isento
        De R$ 2000,01 a R$ 3000,00 		| 8%
        De R$ 3000,01 a R$ 4500,00		| 18%
        Acima de R$4500,01			    | 28%

        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais. */

        System.out.println("Digite o valor do salário:  ");
        numeroUm = sc.nextDouble();
        double imposto;
        if (numeroUm <= 2000.0){
            System.out.println("O imposto até essa faixa de preço é isento");
        }else if (numeroUm <= 3000){
            imposto = (numeroUm -2000) * 0.08;
            System.out.println("O valor do imposto é de: " + imposto);
        }else if (numeroUm <= 4500){
            imposto = (numeroUm-3000) * 0.18 + 1000* 0.08;
            System.out.println("O valor do imposto é de: " + imposto);
        }else{
            imposto = (numeroUm - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.println("O valor do imposto é de: " + imposto);
        }


        sc.close();
    }
}
