import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Aylana dimaetri: ");
        int d = sc.nextInt();

        double PI = 3.14;
        double L = PI * d;
        System.out.print("Uzunligi: " + L);
    }
}
