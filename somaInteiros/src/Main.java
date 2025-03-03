import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, resultado;

        System.out.print("Digite um valor para a: ");
        a = sc.nextInt();
        System.out.print("Digite um valor para b: ");
        b = sc.nextInt();
        resultado = a + b;
        System.out.println("SOMA = " + resultado);
    }
}