import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Doira radiusi: ");
        int R = sc.nextInt();

        double PI = 3.14;
        double L =  2 * PI * R;
        double S = PI * Math.pow(R,2);
        System.out.println("Uzunligi: " + L);
        System.out.print("Yuzasi: " + S);
    }
}
