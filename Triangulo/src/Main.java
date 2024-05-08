import classeTriangulo.Ponto;
import classeTriangulo.Triangulo;

public class Main {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto(0, 0);
        Ponto ponto2 = new Ponto(4, 0);
        Ponto ponto3 = new Ponto(0, 3);


        Triangulo triangulo = new Triangulo(ponto1, ponto2, ponto3);
        System.out.println(triangulo);
    }

}