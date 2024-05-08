package Animais;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    public void latir() {
        System.out.printf(" %s comeu\n", getNome());

    }

    public void lamber() {
        System.out.printf(" %s lambeu\n", getNome());

    }

}
