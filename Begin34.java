import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X kg shokolad: ");
        int x = sc.nextInt();
        System.out.print("Necha so'm: ");
        int a = sc.nextInt();
        System.out.print("Y kg konfet: ");
        int y = sc.nextInt();
        System.out.print("B so'm: ");
        int ab = sc.nextInt();

        int A1 = a / x;
        int A2 = ab / y;
        int sum = A1 / A2;
        System.out.println("Shokolad konfetdan " + sum + " so'm qimmat");

    }
}
