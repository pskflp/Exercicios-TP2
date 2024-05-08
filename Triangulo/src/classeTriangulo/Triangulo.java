package classeTriangulo;

public class Triangulo {

    Ponto ponto1, ponto2, ponto3;

    public Triangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;

    }

    double calcularDistancia(Ponto ponto1, Ponto ponto2) {
        return Math.sqrt((Math.pow(ponto2.x - ponto1.x, 2)) + Math.pow(ponto2.y - ponto1.y, 2));

    }

    double perimetro(){
        double lado1 = calcularDistancia(ponto1, ponto2);
        double lado2 = calcularDistancia(ponto2, ponto3);
        double lado3 = calcularDistancia(ponto3, ponto1);

        return lado1 + lado2 + lado3;

    }

    public double getLado1(){
        return calcularDistancia(ponto1, ponto2);
    }

    public double getLado2(){
        return calcularDistancia(ponto2, ponto3);
    }

    public double getLado3(){
        return calcularDistancia(ponto3, ponto1);
    }

    double area(){
        double semiperimetro = perimetro()/2;

        double lado1 = calcularDistancia(ponto1, ponto2);
        double lado2 = calcularDistancia(ponto2, ponto3);
        double lado3 = calcularDistancia(ponto3, ponto1);
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    public String toString(){

        String InformacoesdoTriangulo = String.format("O triangulo possui perimetro %.2f, area %.2f e a distância dos pontos são: lado1- %.2f, lado2- %.2f, lado3- %.2f"
        , perimetro(), area(), getLado1(), getLado2(), getLado3() );
        return InformacoesdoTriangulo;
    }



}
