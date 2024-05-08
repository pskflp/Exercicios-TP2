import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
       Pessoa pessoa= new Pessoa();
       pessoa.setNome("Victor");
       pessoa.setIdade(23);
       pessoa.setAltura(2.20f);

       System.out.format("Nome: %s, idade = %d e %.2fm",
       pessoa.getNome(),
       pessoa.getIdade(),
       pessoa.getAltura()
       );



       }
}
