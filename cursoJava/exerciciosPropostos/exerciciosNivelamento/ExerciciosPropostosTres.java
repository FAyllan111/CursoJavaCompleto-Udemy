package cursoJava.exerciciosPropostos.exerciciosNivelamento;

import java.util.Scanner;

public class ExerciciosPropostosTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroUm, numeroDois;

        System.out.println("----------------Exercicio 1-------------");
        /* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        */
        System.out.println("Digite sua senha: ");
        numeroUm=0;

        while(numeroUm != 2002){
            numeroUm = sc.nextInt();
            System.out.println("Senha Inválida!");
            System.out.println("Tente novamente: ");

        }

        System.out.println("Acesso permitido! ");

        System.out.println("----------------Exercicio 2-------------");

        /* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */

        numeroUm = -1;
        numeroDois = -1;

        while (numeroUm != 0 || numeroDois != 0){
            System.out.println("Digite valor de X: ");
            numeroUm = sc.nextInt();
            System.out.println("Digite o valor de Y: ");
            numeroDois = sc.nextInt();
            if (numeroUm > 0 && numeroDois > 0){
                System.out.println("O valor está no 1° quadrante");
            } else if (numeroUm < 0 && numeroDois > 0) {
                System.out.println("O valor está no 2° quadrante");
            }else if(numeroUm < 0 && numeroDois < 0){
                System.out.println("O valor está no 3° quadrante");
            }else{
                System.out.println("O valor está no 4° quadrante");
            }
        }
        System.out.println("O valor está sobre um dos eixos ");

        System.out.println("----------------Exercicio 3-------------");

        /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
         */
        int gasolina,diesel,alcool;

        gasolina=0;
        diesel =0;
        alcool=0;

        while (numeroUm != 4){
            System.out.println("Digite o código desejado: ");
            numeroUm= sc.nextInt();
            switch (numeroUm){
                case 1:
                    System.out.println("Será abastecido com Alcool");
                    alcool+= 1;
                    break;
                case 2:
                    System.out.println("Será abastecido com Gasolina");
                    gasolina+=1;
                    break;
                case 3:
                    System.out.println("Será abastecido com Diesel");
                    diesel+=1;
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Código inválido");
            }
        }
        System.out.println("Muito obrigado ");
        System.out.println("Gasolina : "+ gasolina);
        System.out.println("Diesel: "+ diesel);
        System.out.println("Alcool: "+ alcool);

        sc.close();
    }
}
