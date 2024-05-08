public class Serie {

    private String nome;
    private int temporadas;
    private int ano;

    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;

    }

    //Metodos

    @Override
    public String toString(){
        String informacoes = String.format("Nome: %s (%d) - %d temporada(s).", nome, ano, temporadas);
        return informacoes;
    }

    //Getter e Setters

    public String getNome(){
        return nome;
    }

    public int getTemporadas(){
        return temporadas;

    }

    public int getAno(){
        return ano;
    }

}
