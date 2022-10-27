import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A uchun son: ");
        int a = sc.nextInt();
        System.out.print("B uchun son: ");
        int b = sc.nextInt();
        System.out.print("C uchun son: ");
        int c = sc.nextInt();

        int temp = c;
        int a1 = c = b;
        int temp1 = b;
        int a2 = b = a;
        int a3 = a = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }
}
