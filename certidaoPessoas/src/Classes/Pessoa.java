package Classes;

public class Pessoa {

    private String nome;
    private Certidao certidao;
    private boolean possuiCertidao;

    public Pessoa(String nome){
        this.nome = nome;
    }


    public void associarCertidao(Certidao certidao) {

        this.certidao = certidao;
        certidao.setPessoa(this);

    }

    public String getNome(){
        return nome;

    }

    public Certidao getCertidao(){
        return certidao;
    }

    public String toString(){
        if (certidao != null){
            return "Nome: " + nome + "\nCertidão de Nascimento: Sim\n " + certidao.toString();

        } else {
            return "Nome: " + nome + "\nCertidão de Nascimento: Não";

        }


    }
}
