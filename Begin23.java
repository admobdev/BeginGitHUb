import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A uchun son: ");
        int a = sc.nextInt();
        System.out.print("B uchun son: ");
        int b = sc.nextInt();
        System.out.print("C uchun son: ");
        int c = sc.nextInt();

        int temp = b;
        int a1 = b = a;
        int temp1 = a;
        int a2 = a = c;
        int a3 = c = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }
}
