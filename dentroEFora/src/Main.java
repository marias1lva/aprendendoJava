// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro
// do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações. (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        int in = 0, out = 0;
        System.out.print("Informe a quantidade de valores: ");
        N = sc.nextInt();
        System.out.println("Digite os valores: ");
        for(int i = 0; i < N; i++){
            x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println("Valores dentro do intervalo: " + in);
        System.out.println("Valores fora do intervalo: " + out);
        sc.close();
    }
}