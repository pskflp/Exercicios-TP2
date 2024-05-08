public class AlunoAcademia {

    private float peso;
    private float altura;

    public AlunoAcademia(float peso, float altura){

        this.peso = peso;
        this.altura = altura;



    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float pesoMinimo(){
        return 18.5f * altura;
    }

    public float pesoMaximo(){
        return 24.9f * altura;
    }

    public float imc(){
        return (float) peso/altura;

    }
}
