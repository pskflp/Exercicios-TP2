public class produto {

    private int codigo;
    private String descricao;
    private float precodeCusto;
    private float precodeVenda;
    private float margemLucro;


    //Construtor

    public produto(int codigo, String descricao, float precodeCusto){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precodeCusto = precodeCusto;
        this.precodeVenda = precodeCusto;

    }


    //Metodos

    public float calcularMargemlucro(){
        return ((precodeVenda - precodeCusto) / precodeCusto) * 100;
    }

    public void setMargemLucro(float percentual){
        this.margemLucro = percentual;
        this.precodeVenda = precodeCusto * ( 1 + margemLucro / 100);
    }

    public void setPrecodeVenda(float valor){
        this.precodeVenda = valor;
        this.margemLucro = calcularMargemlucro();

    }

    public void imprimirProduto(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Precode Custo: " + precodeCusto);
    }

    //Getters e Setters

    public float getPrecodeVenda(){
        return precodeVenda;
    }

    public float getMargemLucro(){
        return margemLucro;
    }

}
