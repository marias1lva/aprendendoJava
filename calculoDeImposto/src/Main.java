import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;
        imposto = 0.0;
        System.out.print("Informe o salario: R$");
        salario = sc.nextDouble();

        if(salario <= 2000.00){
            System.out.println("Isento");
        }else if(salario > 2000.00 && salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;
        }else if(salario > 3000.00 && salario <= 4500.00){
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        }else{
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }
        System.out.printf("R$%.2f", imposto);

        sc.close();
    }
}