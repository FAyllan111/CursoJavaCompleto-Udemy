package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

