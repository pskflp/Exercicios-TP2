//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Personagem personagem = new Personagem();

        personagem.nome = "Eleanor";
        personagem.nível = 7;
        personagem.forca = 26;
        personagem.vida = 100;
        personagem.inteligencia = 2;
        personagem.habilidades = "Bola de fogo";

        personagem.mostrarStatus();
        personagem.atacar("Hydra","Tornado Cintilante");
        System.out.println(personagem.calcularDano());
    }
}
