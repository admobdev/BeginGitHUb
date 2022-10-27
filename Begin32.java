import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gradus selsiy qiymatini kiriting: ");
        double C = sc.nextDouble();

        double GF = (C * 9 / 5) + 32;
        System.out.println("Farengeyt gradusi: ");
        System.out.println(GF);
    }
}
