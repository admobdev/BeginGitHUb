import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 -mashina tezligi: ");
        int v1 = sc.nextInt();
        System.out.print("2 -mashina tezligi: ");
        int v2 = sc.nextInt();
        System.out.print("Orasidagi masofa: ");
        int s = sc.nextInt();
        System.out.print("Qancha vaqtdan keyin: ");
        int t = sc.nextInt();

        int S = s + (v1 + v2) * t;
        System.out.println("Javob: " + s);
    }
}
