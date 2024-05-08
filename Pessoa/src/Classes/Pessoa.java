package Classes;

public class Pessoa {

    private String nome = "Victor";
    private int idade = 20;
    private double altura = 1.70;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }
}
