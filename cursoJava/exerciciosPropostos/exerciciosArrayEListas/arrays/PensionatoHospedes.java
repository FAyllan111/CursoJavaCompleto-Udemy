package cursoJava.exerciciosPropostos.exerciciosArrayEListas.arrays;

public class PensionatoHospedes {
    private String nome;
    private String email;

    public PensionatoHospedes(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void exibirQuartos(){
        System.out.printf("Nome: " + getNome() + " ,Email: " + getEmail());
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
