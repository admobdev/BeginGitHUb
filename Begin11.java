import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinchi son: ");
        int a = sc.nextInt();
        System.out.print("Ikkinchi son: ");
        int b = sc.nextInt();

        int sum = a + b;
        int mul = a * b;
        int moda = Math.abs(a);
        int modb = Math.abs(b);

        System.out.println("Yigindisi: " + sum);
        System.out.println("Ko'paytmasi: " + mul);
        System.out.println("A ning moduli: " + moda);
        System.out.println("B ning moduli: " + modb);
    }
}
