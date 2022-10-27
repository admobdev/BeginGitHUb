import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("R1 radius: ");
        int r1 = sc.nextInt();
        System.out.print("R2 radius: ");
        int r2 = sc.nextInt();

        double pi = 3.14;
        double S1 = pi * r1;
        double S2 = pi * r2;
        double S3 = pi * ( r1 - r2 );
        System.out.println("S1: " + S1);
        System.out.println("S1: " + S2);
        System.out.println("S1: " + S3);
    }
}
