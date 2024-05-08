import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Qual o nome do aluno? \n");


        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        int nota;
        int total = 0;


        int i;
        for (i = 0; i < 3; i++) {
            nota = scanner.nextInt();
            total = total + nota;
        }

        float média = (float) total / i;

        System.out.printf("A média do %s é: %.2f%n", nome, média);

        scanner.close();
    }
}