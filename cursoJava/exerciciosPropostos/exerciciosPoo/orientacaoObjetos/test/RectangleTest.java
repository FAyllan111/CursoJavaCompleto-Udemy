package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.test;

import cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain.Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercicio 1: ");
        System.out.println();

        Rectangle retangulo1 = new Rectangle();
        Rectangle retangulo2 = new Rectangle();

        System.out.println("Digite a altura e largura do triangulo: ");
        retangulo1.width = sc.nextDouble();
        retangulo1.heigth =sc.nextDouble();
        System.out.println("O resultado é: ");
        retangulo1.result();

        System.out.println("Digite a altura e largura do triangulo: ");
        retangulo2.heigth = sc.nextDouble();
        retangulo2.width =sc.nextDouble();
        System.out.println("O resultado é: ");
        retangulo2.result();



        sc.close();
    }
}
