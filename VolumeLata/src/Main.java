import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os números inteiros n e m
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor de m: ");
        int m = scanner.nextInt();

        // Imprimir os números ímpares no intervalo de n a m
        System.out.println("Números ímpares no intervalo de " + n + " a " + m + ":");
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}