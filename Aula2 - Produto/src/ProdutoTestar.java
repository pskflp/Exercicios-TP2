public class ProdutoTestar {

    public static void main(String[] args){

        Produto p1 = new Produto();
        p1.nome="Caneta";
        p1.marca = "Bic";
        p1.valor = 1.20f;

        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 2.50f;

        Produto p3 = new Produto("Borracha","Mercur", 1.89f);

        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: "+ p1.valor);

    }
}
