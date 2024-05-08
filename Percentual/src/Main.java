import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.print("Salário: \n");


        Scanner leitor = new Scanner(System.in);
        int salario = leitor.nextInt();

        System.out.print("Comissão: \n");
        float comissao = leitor.nextFloat();

        float Salariototal = salario + (salario *  (comissao / 100));

        System.out.println("O salário é "+ Salariototal);

        leitor.close();

    }
}