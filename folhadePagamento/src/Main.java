
public class Main {
    public static void main(String[] args) {

        Funcionario colaborador = new Funcionario(2020, "Victor",
                1232.30f);

        colaborador.imprimirFuncionario();
        colaborador.aumentoSalarial(20);
        colaborador.imprimirFuncionario();

        colaborador.descontoIR();
        System.out.println(colaborador.descontoIR());


    }
}