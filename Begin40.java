import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int A1 = sc.nextInt();
        System.out.print("B: ");
        int B1 = sc.nextInt();
        System.out.print("C: ");
        int C1 = sc.nextInt();
        System.out.print("A1: ");
        int A2 = sc.nextInt();
        System.out.print("B2: ");
        int B2 = sc.nextInt();
        System.out.print("C3: ");
        int C2 = sc.nextInt();

       int D = (A1 * B2) - (A2 * B1);
        int x = ((C1 * B2) - (C2 * B1)) / D;
        int y = ((A1 * C2) - (A2 * C1)) / D;

        System.out.println(x);
        System.out.println(y);
    }
}
