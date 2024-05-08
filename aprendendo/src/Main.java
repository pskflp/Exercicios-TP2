public class Main {

    public static void main(String[] args) {

        // Declarando um objeto do tipo celular = instanciando um objeto
        Celular celularA = new Celular();

        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 128;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy";
        celularB.tamanhoTela = 12.2f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "ANDROID";



    System.out.format("Celular %s com tela de %f, com %d e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
    System.out.format("Celular %s com tela de %f, com %d e SO %s", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);

}
    }
