import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A burchak (radianda): ");
        int r = sc.nextInt();
        int N = (int) ( 180 / (Math.PI * r));
        System.out.println(N);
    }
}
