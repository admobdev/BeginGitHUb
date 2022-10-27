import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aylana yuzasi: ");
        int S = sc.nextInt();

        double pi = 3.14;
        double d = (S / (2 * pi));
        double R = pi * Math.pow(d,2);
        System.out.println("Diametri: " + d);
        System.out.println("Radiusi: " + R);
    }
}
