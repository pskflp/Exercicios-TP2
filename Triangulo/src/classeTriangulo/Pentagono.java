package classeTriangulo;

public class Pentagono {
    Ponto ponto1, ponto2, ponto3, ponto4, ponto5;

    public Pentagono(Ponto ponto1, Ponto ponto2, Ponto ponto3,
                     Ponto ponto4, Ponto ponto5){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;
        this.ponto4 = ponto4;
        this.ponto5 = ponto5;
    }

    double calcularDistancia(Ponto ponto1, Ponto ponto2) {
        return Math.sqrt((Math.pow(ponto2.x - ponto1.x, 2)) + Math.pow(ponto2.y - ponto1.y, 2));

    }


    public double perimetro(){
        double lado1 = calcularDistancia(ponto1, ponto2);
        double lado2 = calcularDistancia(ponto2, ponto3);
        double lado3 = calcularDistancia(ponto3, ponto4);
        double lado4 = calcularDistancia(ponto4, ponto5);
        double lado5 = calcularDistancia(ponto5, ponto1);

        return lado1 + lado2 + lado3 + lado4 + lado5;
    }

    public double area(){
        double area(){
            double semiperimetro = perimetro()/2;

            double lado1 = calcularDistancia(ponto1, ponto2);
            double lado2 = calcularDistancia(ponto2, ponto3);
            double lado3 = calcularDistancia(ponto3, ponto4);
            double lado4 = calcularDistancia(ponto4, ponto5);
            double lado5 = calcularDistancia(ponto5, ponto1);
            return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        }
    }
}
