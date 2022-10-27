import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MANFIY BO'LMAGAN SON");

        System.out.print("A tomoni: ");
        int a = sc.nextInt();
        System.out.print("B tomoni: ");
        int b = sc.nextInt();

        int S = a + b;
        int OA = (int) Math.sqrt(S);
        System.out.println("O'rta arifmetigi: " + OA);
    }
}
