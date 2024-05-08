import java.util.Random;

public class Personagem {

    String nome;
    int nível;
    int vida;
    int forca;
    int inteligencia;
    String habilidades;

    void mostrarStatus() {
        System.out.format("Personagem: %s ( lvl %d ) com %d de força.\n", nome, nível, forca);

    }

    int calcularDano(){
        Random gerador = new Random();

        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    void atacar(String inimigo, String habilidade) {

        int danoCausado = 0;
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, inimigo, forca);

        } else
        {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, inimigo, forca);
        }

    }
}
