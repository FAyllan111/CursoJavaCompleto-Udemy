package cursoJava.modulo.exerciciosNivelamento;

import java.util.Scanner;

public class ExcerciciosPropostosUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado;
        System.out.println("------------Excercicio 1-----------");
        //Exercicio 1:Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

        int a, b ;
        System.out.println("Digite os valores de dois números inteiros:");
        a = sc.nextInt();
        b = sc.nextInt();

        resultado = a + b;

        System.out.println("Resultado da soma é : " + a + " + " + b + " = " + resultado);

        System.out.println("------------Excercicio 2-----------");
        //Exercicio 2:Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

        double raio;
        System.out.println("Digite o valor do raio da circunferência:");
        raio = sc.nextDouble();
        double diametro = Math.pow(raio,2);
        resultado = 3.14159 * diametro;

        System.out.println("Resultado da área do circulo é :" + resultado);
        //*Fórmula da área: area = π . raio2
        // *Considere o valor de π = 3.14159

        System.out.println("------------Excercicio 3-----------");
        //Exercicio 3:Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int c,d,e,f;

        System.out.println("Digite os valores a serem realizados a diferença: ");

        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        resultado = (c*d - e*f);

        System.out.println("O resultado da diferença é: " + resultado);


        System.out.println("------------Excercicio 4-----------");
        //Exercicio 4:Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int numeroFuncionario,horasTrabalhadas;
        double valorHora;

        System.out.println("Programa para calcular valor do salário:");
        System.out.println("Digite o número do funcionário:");
        numeroFuncionario = sc.nextInt();
        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor hora: ");
        valorHora = sc.nextDouble();

        resultado = horasTrabalhadas * valorHora;

        System.out.println("Resultado das horas trabalhadas do funcionário " + numeroFuncionario + " é igual a : R$ " + resultado);

        System.out.println("------------Excercicio 5-----------");
        //Exercicio 5:Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int codigoPeca,numeroPecas;
        double valorUnitario;
        System.out.println("Programa para verificar o valor de pedido");
        System.out.println("Digite o código da peça: ");
        codigoPeca = sc.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        numeroPecas = sc.nextInt();
        System.out.println("Digite o valor unitário: ");
        valorUnitario  = sc.nextDouble();

        resultado = numeroPecas * valorUnitario ;

        System.out.println("O valor de " + numeroPecas + " da peça " + codigoPeca + " é de R$: " + resultado);

        System.out.println("------------Excercicio 6-----------");
        //Exercicio 6:Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a)	a área do triângulo retângulo que tem A por base e C por altura.
        //b)	a área do círculo de raio C. (pi = 3.14159)
        //c)	a área do trapézio que tem A e B por bases e C por altura.
        //d)	a área do quadrado que tem lado B.
        //e)	a área do retângulo que tem lados A e B.

        double areaForma, baseForma , alturaForma;

        System.out.println("Programa para calcular a área de diferentes formas geométricas:");
        System.out.println("Digite a área da forma: ");
        areaForma = sc.nextDouble();
        System.out.println("Digite a base da forma: ");
        baseForma = sc.nextDouble();
        System.out.println("Digite a altura da forma: ");
        alturaForma = sc.nextDouble();

        double areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;

        areaTriangulo = baseForma * alturaForma;
        areaCirculo = Math.pow(alturaForma,2)  * 3.14159;
        areaTrapezio = (areaForma + baseForma)*alturaForma/2;
        areaRetangulo = areaForma * baseForma;
        areaQuadrado = Math.pow(baseForma,2);

        System.out.println("A área do triângulo é :" + areaTriangulo);
        System.out.println("A área do circulo é :" + areaCirculo);
        System.out.println("A área do trapézio é :" + areaTrapezio);
        System.out.println("A área do quadrado é :" + areaQuadrado);
        System.out.println("A área do retângulo é :" + areaRetangulo);


        sc.close();
    }
}
