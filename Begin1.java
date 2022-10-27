import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kvadratning tomoni: ");
        int a = sc.nextInt();

        int P = 4 * a;
        System.out.println("Perimetri: " + P);
    }
}