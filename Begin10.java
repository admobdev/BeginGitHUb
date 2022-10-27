import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinchi son: ");
        int a = sc.nextInt();
        System.out.print("Ikkinchi son: ");
        int b = sc.nextInt();

        int sum = a + b;
        int mul = a * b;
        int sqra = (int) Math.pow(a,2);
        int sqrb = (int) Math.pow(b,2);

        System.out.println("Yigindisi: " + sum);
        System.out.println("Ko'paytmasi: " + mul);
        System.out.println("A ning kvadrati: " + sqra);
        System.out.println("B ning kvadrati: " + sqrb);
    }
}
