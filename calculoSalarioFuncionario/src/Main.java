import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        System.out.print("Informe o numero do funcionario: ");
        numero = sc.nextInt();
        System.out.print("Informe o numero de horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.print("Informe o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMERO = " + numero);
        System.out.printf("SALARIO = R$%.2f", salario);
    }
}