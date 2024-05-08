import Classes.Pessoa;

public class Main{

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("batman");
        String nome = pessoa.getNome();
        System.out.println(nome);

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}