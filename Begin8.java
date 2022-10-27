import java.util.Scanner;

public class Begin8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A tomoni: ");
        int a = sc.nextInt();
        System.out.print("B tomoni: ");
        int b = sc.nextInt();

        int OA = ( a + b) / 2;
        System.out.println("O'rta arifmetigi: " + OA);
    }
}
