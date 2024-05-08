
public class Main {
    public static void main(String[] args) {

        AlunoAcademia aluno = new AlunoAcademia(72.30f, 1.70f);

        System.out.println("O peso máximo do aluno é: " + aluno.pesoMaximo());
        System.out.println("O peso minimo do aluno é: " + aluno.pesoMinimo());
        System.out.println("O IMC do aluno é: " + aluno.imc());


    }
}