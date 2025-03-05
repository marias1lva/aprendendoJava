// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que
// ele pertence. O algoritmo será encerrado quando pelo menos uma das coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        while(x != 0 && y != 0){
               if(x > 0 && y > 0){
                   System.out.println("O ponto pertence ao quadrante 1");
               }else if(x < 0 && y > 0){
                   System.out.println("O ponto pertence ao quadrante 2");
               }else if(x < 0 && y < 0){
                   System.out.println("O ponto pertence ao quadrante 3");
               }else{
                   System.out.println("O ponto pertence ao quadrante 4");
               }
               System.out.print("Digite o valor de X: ");
               x = sc.nextInt();
               System.out.print("Digite o valor de Y: ");
               y = sc.nextInt();
        }

        sc.close();
    }
}