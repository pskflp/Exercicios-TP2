package Classes;


public class Certidao{

    private Data dataEmissao;
    private Pessoa pessoa;

    public Certidao(Data dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Data getDataEmissao() {
        return dataEmissao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    @Override

    public String toString() {
        return "Data de Emissao: " + dataEmissao;
    }


}
