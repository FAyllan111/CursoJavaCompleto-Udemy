package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain;

/*
EX2 :
Fazer um programa para ler os dados de um funcionário (nome,salario bruto e imposto) . E m seguida, mostrar os dados do funcionário (nome e salario liquido). Em seguida, aumentar o salario do funcionário com base em uma nova porcentagem dada( somente o salario bruto e afetado pela porcentagem) e mostar novamente os dados do funcionário. Use a classe projetada abaixo:

Employee
-name: string
GrossSalary: double
Tax: double

NetSalary: double
Increase Salary(percentage : double) : void

 */


public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public void result(){
        if (this.percentage == 0) {
            System.out.println("Dados funcionário: ");
            System.out.println("Nome: " + this.name + " ,Salário liquido: R$ " + netSalary());
        } else if (this.percentage >0){
            System.out.println("Salario atualizado: ");
            System.out.println("Nome: " + this.name + " ,Salário liquido: R$ " + netSalary() );
        }else{
            System.out.println("Não é possivel diminuir o salário do funcionário! ");
        }

    }


    public double netSalary(){
        return grossSalary - tax;

    }

    public void increaseSalary(double percentage){
        this.percentage = percentage;
        grossSalary += grossSalary * this.percentage / 100;
    }


}
