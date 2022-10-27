import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X kg: ");
        int x = sc.nextInt();
        System.out.print("Necha so'm: ");
        int a = sc.nextInt();
        System.out.print("Y kg: ");
        int y = sc.nextInt();

        int A1 = a / x;
        int A2 = A1 * y;
        System.out.println("1 kg narxi: " + A1);
        System.out.println("Y kg narxi: " + A2);
    }
}
