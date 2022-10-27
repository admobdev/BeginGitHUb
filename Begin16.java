import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X1 uchun son: ");
        int x1 = sc.nextInt();
        System.out.print("x2 uchun son: ");
        int x2 = sc.nextInt();

        int masofa = Math.abs(x2 - x1);
        System.out.println("Masofa: " + masofa);
    }
}