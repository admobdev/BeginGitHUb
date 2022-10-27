import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A ni kiriting: ");
        int A = sc.nextInt();
        System.out.print("B ni kiriting: ");
        int B = sc.nextInt();
        System.out.print("C ni kiriting: ");
        int C = sc.nextInt();

        int AC = C - A;
        int BC = C - B;

        System.out.println("Kesmalar uzunligining ko'paytmasi:  " + (AC * BC) + " ga teng");
    }
}
