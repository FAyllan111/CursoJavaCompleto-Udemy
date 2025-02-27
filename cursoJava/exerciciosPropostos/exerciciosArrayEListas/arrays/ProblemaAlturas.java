package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */

//usando a resolução com a declaração de classes

public class ProblemaAlturas {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i=0;i<n;i++){
            System.out.println("Digite os dados da " +(i+1)+ "° pessoa: ");
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            System.out.println("Digite a idade:");
            int idade = sc.nextInt();
            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome,idade,altura);

        }
        double percentual=0;
        double soma =0;
        for (int i=0;i<n;i++){
            soma+= pessoas[i].getAltura();

        }
        String menoresDeIdade ="";
        for (int i=0;i<n;i++){
            if (pessoas[i].getIdade()<16){
                menoresDeIdade = pessoas[i].getNome();
                percentual += 1;
            }
        }
        double porcentagem = (percentual / pessoas.length)*100;
        double media = soma /pessoas.length;
        System.out.println("* Resultados: *");
        System.out.println("A altura média é de: " + media);
        System.out.println("O percentual de pessoas com menos de 16 anos é de: "+ porcentagem +"%");
        System.out.print("E os menores de 16 anos sao: ");
        for (int i=0;i<n;i++){
            if (pessoas[i].getIdade()<16){
                menoresDeIdade = pessoas[i].getNome();
                System.out.print(menoresDeIdade+",");
            }
        }

        sc.close();
    }

}
