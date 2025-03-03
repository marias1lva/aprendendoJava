import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;
        System.out.print("Digite o codigo do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        if(codigo == 1){
            total = 4.00 * quantidade;
        }else if(codigo == 2){
            total = 4.50 * quantidade;
        }else if(codigo == 3){
            total = 5.00 * quantidade;
        }else if(codigo == 4){
            total = 2.00 * quantidade;
        }else{
            total = 1.50 * quantidade;
        }

        System.out.printf("Total: R$%.2f", total);

        sc.close();
    }
}