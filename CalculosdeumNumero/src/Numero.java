public class Numero {
    private float n;

    public Numero(float n) {
        this.n = n;


    }

    public float fatorial(){
        if (n == 0)
            return 1;
        float resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;

        }
        return resultado;

    }

    public float potencia(int x){
        return (float) Math.pow(x, n);
    }

    public int parteInteira(){
        return (int) n;
    }

    public float parteDecimal() {
        return n - parteInteira();
    }
    public float inverte(){
        return 1/n;
    }

    public void imprimirDados(){
        Numero num = new Numero(5.5f);
        System.out.println("Fatorial de " + num.n + ": " + num.fatorial());
        System.out.println("Potência de " + num.n + " elevado a 2: " + num.potencia(2));
        System.out.println("Parte inteira de " + num.n + ": " + num.parteInteira());
        System.out.println("Parte decimal de " + num.n + ": " + num.parteDecimal());
        System.out.println("Inverso de " + num.n + ": " + num.inverte());
    }

}
