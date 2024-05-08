import Animais.Gato;
import Animais.Dragao;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Gatinho");

        gato.miar();
        gato.beber();


        Dragao drago = new Dragao("Draguito");

        drago.cuspirFogo();
        drago.comer();



    }
}