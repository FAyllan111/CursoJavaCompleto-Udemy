package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain;

/*
Ex3 :
Fazer um programa para ler o nome de um aluno e três notas que ele obteve nos três trimestres do ano ( o prmeiro trimestre vale 30 e o segundo e o terceiro valem 35). Ao final. Mostrar quan nota do aluno no ano. Dizer também se o aluno esta aprovado (pass) ou não (falied)e , em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (60 pontos), você deve criar uma classe Student para resolver esse problema.

 */

public class Student {
    public String name;
    public double firstQuarter,secondQuarter,thirdQuarter;


    public void result(){
        System.out.println(" * Dados do aluno * ");
        System.out.println("Nome: "+ this.name);
        System.out.println("Nota final : "+ finalGrade());
        System.out.println(missingNote());
    }

    public double finalGrade(){
        if (this.firstQuarter <= 30 || this.secondQuarter <= 35 || this.thirdQuarter <= 35){
        return firstQuarter + secondQuarter + thirdQuarter;}
        else {
            System.out.println("Valores das notas inválidas");
        }
        return 0;
    }

    public double missingNote(){
        if (finalGrade() > 60){
            System.out.println("O aluno " + this.name +" passou!");
        }else{
            System.out.println("O aluno "+this.name +" não passou!");
            System.out.println("Faltam " + (60-finalGrade()) + " pontos para o aluno passar. ");
        }
        return 0;
    }

}
