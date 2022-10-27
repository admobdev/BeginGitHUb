import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kvadrat tomoni: ");
        int a = sc.nextInt();
        int S = (int) Math.pow(a,2);

        System.out.print("Yuzasi: " + S);
    }
}
