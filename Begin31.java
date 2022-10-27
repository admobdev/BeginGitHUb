import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Farengeyt temperaturani kiriting: ");
        double TF = sc.nextDouble();

        double TC = (TF - 32) * 5 / 9 ;
        System.out.println("Farengeyt gradusi: ");
        System.out.println(TC);
    }
}
