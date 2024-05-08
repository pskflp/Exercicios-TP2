
public class Main {
    public static void main(String[] args) {

        produto produto1 = new produto(1001, "Produto Bom", 50.0f);

        produto1.imprimirProduto();



        System.out.println("Preço de Venda inicial: " + produto1.getPrecodeVenda());
        System.out.println("Margem de Lucro inicial: " + produto1.getMargemLucro() + "%");

        // Alterar a margem de lucro
        produto1.setMargemLucro(30.0f);
        System.out.println("Preço de Venda após alteração da margem de lucro: " + produto1.getPrecodeVenda());
        System.out.println("Nova Margem de Lucro: " + produto1.getMargemLucro() + "%");

        // Alterar o preço de venda
        produto1.setPrecodeVenda(70.0f);
        System.out.println("Novo preço de venda é " + produto1.getPrecodeVenda());
        System.out.println("Margem de Lucro após alteração do preço de venda: " + produto1.getMargemLucro() + "%");

    }
}