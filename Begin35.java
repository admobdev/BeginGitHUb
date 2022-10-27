import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qayiq tezligi ( V > U): ");
        int v = sc.nextInt();
        System.out.print("Oqim tezlgi: ");
        int u = sc.nextInt();
        System.out.print("Harakatlanish vaqti: ");
        int t1 = sc.nextInt();
        System.out.print("Oqimga qarshi: ");
        int t2 = sc.nextInt();

        int S = (t1 * v) + (t2 * (v - u));
        System.out.println("Yonalishi: " + S);
    }
}
