public class Venda {
    private float valor;
    private float percentualDesconto;

    public Venda(float valor, float percentualDesconto) {
        this.valor = valor;
        this.percentualDesconto = percentualDesconto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public void imprimirvalorMensalidade(int parcelas){
        float desconto = valor * (percentualDesconto/100);
        float valortotal = valor - desconto;
        float valorMensalidade = valortotal * parcelas;
        System.out.println("Valor da mensalidade: " + valorMensalidade + " para as " + parcelas + " parcelas");

    }

}
