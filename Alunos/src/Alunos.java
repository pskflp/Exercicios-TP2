public class Alunos {

    private String nome;
    private int matricula;
    private int quantidadedeCreditos;
    private float valorCredito;
    private float percentualDesconto;
    private boolean bolsista;


    public Alunos(String nome, int matricula, int quantidadedeCreditos, float valorCredito, float percentualDesconto, boolean bolsista){


        this.nome = nome;
        this.matricula = matricula;
        this.quantidadedeCreditos = quantidadedeCreditos;
        this.valorCredito = valorCredito;
        this.percentualDesconto = percentualDesconto;
        this.bolsista = bolsista;

    }

    public float valorMensalidade(){
        float valorTotal = quantidadedeCreditos * valorCredito;
        if (bolsista){
            float desconto = (percentualDesconto / 100) * valorTotal;
            return valorTotal - desconto;
        } else {
            return valorTotal;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getQuantidadedeCreditos() {
        return quantidadedeCreditos;
    }

    public void setQuantidadedeCreditos(int quantidadedeCreditos) {
        this.quantidadedeCreditos = quantidadedeCreditos;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public void imprimirInformações(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Quantidade de credito: " + quantidadedeCreditos);
        System.out.println("Valor credito: " + valorCredito);
        System.out.println("Percentual desconto: " + percentualDesconto);
        System.out.println("Bolsista: " + bolsista);
        System.out.println("Valor da mensalidade: " + valorMensalidade());
    }
}
