import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A katet: ");
        int a = sc.nextInt();
        System.out.print("B katet: ");
        int b = sc.nextInt();

        int c = (int) Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
        int P = a + b + c;
        System.out.println("Gipotenuzasi: " + c);
        System.out.println("Perimetri: " + P);

    }
}
