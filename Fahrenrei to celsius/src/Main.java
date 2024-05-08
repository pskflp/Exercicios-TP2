//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: \n");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();

    }
}