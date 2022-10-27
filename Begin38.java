import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        int x = -b / a;
        System.out.println("Javob: " + x);
    }
}