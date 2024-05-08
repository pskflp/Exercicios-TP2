import Classes.Data;
import Classes.Pessoa;
import Classes.Certidao;


public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Joao");

        Data dataEmissao = new Data(1,1,2020);

        Certidao certidao = new Certidao(dataEmissao);

        System.out.println(pessoa1);
        pessoa1.associarCertidao(certidao);

        System.out.println(pessoa1);









    }
}