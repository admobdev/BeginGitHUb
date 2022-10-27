import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aylana uzunligi: ");
        int L = sc.nextInt();

        double pi = 3.14;
        double R = (L / (2 * Math.PI));
        double S = pi * Math.pow(R,2);
        System.out.println("Radiusi: " + R);
        System.out.println("Yuzasi: " + S);
    }
}
