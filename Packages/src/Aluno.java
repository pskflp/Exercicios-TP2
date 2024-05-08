public class Aluno {

    int matricula;
    int quantidadadecreditos;
    float valorporcredito;
    float percentualdedesconto;
    boolean bolsista;

    void valormensalidade() {

        float valormensalidade = 2000;
        if (bolsista) {

            valormensalidade = valormensalidade - (2000 * (percentualdedesconto / 100));
            System.out.println("Valor da mensalidade: " + valormensalidade);

        } else {
            System.out.println("Valor da mensalidade: " + valormensalidade);
        }
    }
}
