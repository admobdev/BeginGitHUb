import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A uchun son: ");
        int a = sc.nextInt();
        System.out.print("B uchun son: ");
        int b = sc.nextInt();

        int temp = a;
        int a1 = a = b;
        int a2 = b = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
