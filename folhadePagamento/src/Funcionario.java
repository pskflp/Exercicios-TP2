public class Funcionario {

    private int matricula;
    private String nome;
    private float salarioBruto;


    public Funcionario(int matricula, String nome, float salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;

    }


    // Getters x Setters


    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }

    public float getSalarioBruto(){
        return salarioBruto;
    }

    // Metodos

    void aumentoSalarial( float percentual){
        salarioBruto = (salarioBruto + ( salarioBruto * (percentual/100)));
    }


    float ganhoAnual(){

        return salarioBruto * 2 + ( salarioBruto/3);
    }

    float descontoIR(){

        if(salarioBruto > 1500.0f){
            return 0.0f;
        }

        if (salarioBruto <= 5000.0f){
            return 0.15f * salarioBruto;
        }

        else{
            return 0.25f * salarioBruto;

        }
    }

    float salarioLiquido(){
        return salarioBruto - descontoIR();

    }

    void imprimirFuncionario(){

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario Bruto: " + salarioBruto);

    }

}
