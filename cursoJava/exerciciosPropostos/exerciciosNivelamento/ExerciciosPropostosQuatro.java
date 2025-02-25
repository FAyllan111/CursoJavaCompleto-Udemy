package cursoJava.exerciciosPropostos.exerciciosNivelamento;

import java.util.Scanner;

public class ExerciciosPropostosQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUm;

        System.out.println("------------------Exercicio 1------------------");
        /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
         */

        System.out.println("Digite o valor de X: ");
        numeroUm = sc.nextInt();
        int numerosImpares=0;
        System.out.println("Numeros impares até " + numeroUm);
        for (int i =0; i<numeroUm; i++){
            numerosImpares = i % 2;
            if (numerosImpares !=0) {
                System.out.println(i);
            }
        }

        System.out.println("------------------Exercicio 2------------------");
        /* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
         */

        System.out.println("Digite o valor de X: ");
        numeroUm = sc.nextInt();
        int quantidadeDentro,quantidadeFora;
        quantidadeDentro=0;
        quantidadeFora =0;
        for (int i = 0; i< numeroUm;i++){
            System.out.println("Digite o "+ (i+1) + "° valor: " );
            int num = sc.nextInt();
            if (num >= 10 && num <= 20){
                quantidadeDentro ++;
            }else {
                quantidadeFora ++;
            }
        }
        System.out.println("Quantidade dentro: " + quantidadeDentro);
        System.out.println("Quantidade fora: " +quantidadeFora);

        System.out.println("------------------Exercicio 3------------------");
        /* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
         */

        System.out.println("Digite a quantidade de números a serem validados: ");
        numeroUm = sc.nextInt();
        double media,a,b,c;
        media = 0;
        for (int i =0; i< numeroUm;i++){
            System.out.println("Digite o valor do 1° número: ");
            a = sc.nextDouble();
            System.out.println("Digite o valor do 2 ° número: ");
            b = sc.nextDouble();
            System.out.println("Digite o valor do 3° número: ");
            c = sc.nextDouble();
            media = ((a *2) + (b*3) + (c* 5) )/10;
            System.out.println("A "+(i+1) +"º média é: " + media);
        }

        System.out.println("------------------Exercicio 4------------------");
        /* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */

        System.out.println("Digite a quantidade de divisões: ");
        numeroUm= sc.nextInt();

        double numerador,denominador;
        for (int i = 0; i < numeroUm;i++){
            System.out.println("Digite o " +(i+1) +"º par de números: ");
            System.out.println("Numerador: ");
            numerador = sc.nextInt();
            System.out.println("Denominador");
            denominador = sc.nextInt();
            if (denominador ==0){
                System.out.println("A divisão por zero é impossivel");
            }else  {
                double resultado = numerador/ denominador;
                System.out.println("A divisão de " + numerador + " pelo " + denominador +" é de: " +resultado);
            }
        }

        System.out.println("------------------Exercicio 5------------------");
        /* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
         */

        System.out.println("Digite o valor a ser calculado o fatorial: ");
        numeroUm = sc.nextInt();
        int fatorial =1;
        for (int i =1; i<= numeroUm;i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de "+ numeroUm +" é de: " + fatorial);

        System.out.println("------------------Exercicio 6------------------");
        /* Ler um número inteiro N e calcular todos os seus divisores.
         */
        System.out.println("Digite o número que deseja descobrir os divisores: ");
        numeroUm = sc.nextInt();
        System.out.println("Os divisores do " + numeroUm + " são: ");
        for (int i=1; i <= numeroUm;i++){
            if (numeroUm % i == 0 ){
                System.out.println("E divisivel por: " + i);
            }
        }
        System.out.println("------------------Exercicio 7------------------");
        /* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.
         */

        System.out.println("Digite o valor a ser lido: ");
        numeroUm =sc.nextInt();
        for (int i = 1; i<=numeroUm ;i++){
            int primeiro = i;
            int segundo = i * i ;
            int terceiro = i*i*i;
            System.out.printf("%d %d %d%n",primeiro,segundo,terceiro);
        }

        sc.close();

    }
}
