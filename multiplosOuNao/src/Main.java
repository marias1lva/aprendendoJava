import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("Digite um valor para x e y: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if(x % y == 0 || y % x == 0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}