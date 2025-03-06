// Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera
// para um raio daquele valor. Informar também o valor de PI com duas casas decimais.

package application;

import java.util.Scanner;
import java.util.Locale;
import util.Calculator;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, c, v;
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        c = Calculator.circumference(radius);
        v = Calculator.volume(radius);

        System.out.printf("Circumference = %.2f%n", c);
        System.out.printf("Volume = %.2f%n", v);
        System.out.printf("PI value = %.2f%n", Calculator.PI);

        sc.close();
    }
}