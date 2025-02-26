package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetosDois.domain;

public class ContaBancaria {

    private int numeroConta;
    private double saldoConta;
    private String nomeTitular;
    private double valor;

    public ContaBancaria(int numeroConta,String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        depositar(depositoInicial);
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    public void apresentar(){
        System.out.println("Numero conta: " + getNumeroConta() + " ,Titular : " + getNomeTitular() + " ,Saldo Conta: R$" + getSaldoConta());

    }

    public double depositar(double valor){
        this.valor = valor;
        return this.saldoConta += valor;

    }

    public double sacar(double valor){
        this.valor = valor;
        return saldoConta = saldoConta - valor - 5.0 ;
    }

}
