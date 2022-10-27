import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A tomoni: ");
        int a = sc.nextInt();
        System.out.print("B tomoni: ");
        int b = sc.nextInt();

        int S = a * b;
        int P = 2 * ( a + b );
        System.out.println("Yuzasi: " + S);
        System.out.print("Perimetri: " + P);
    }
}
