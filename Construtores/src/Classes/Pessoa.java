package Classes;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

    public Pessoa(){
        System.out.println("Nova pessoa");
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
