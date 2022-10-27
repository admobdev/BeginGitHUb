import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        int V = a * b * c;
        int S = 2 * ( a * b + b * c + a * c );
        System.out.println("Hajmi: " + V);
        System.out.println("To'la sirti: " + S);
    }
}
