package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos hospedes seão registrados? ");
        int n = sc.nextInt();
        PensionatoHospedes[] reservas = new PensionatoHospedes[10];


        for (int i =1;i<=n;i++){
            System.out.println("Aluguel #"+ i);
            System.out.println("Digite o nome do hospede: ");
            String nome = sc.next();
            System.out.println("Digite o email do cliente: ");
            String email =sc.next();
            System.out.println("Digite o numero do quarto: ");
            int quarto = sc.nextInt();
            reservas[quarto]= new PensionatoHospedes(nome,email);

        }

        System.out.println("Dados sobre os quartos: ");


        for (int i= 0; i<10;i++){
            if (reservas[i] != null){
                reservas[i].exibirQuartos();
            }
        }

        sc.close();
    }
}
