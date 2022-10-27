import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A ni kiriting: ");
        int A = sc.nextInt();
        System.out.print("B ni kiriting: ");
        int B = sc.nextInt();
        System.out.print("C ni kiriting: ");
        int C = sc.nextInt();

        System.out.print("AC uzunligi: ");
        int AC = C - A;
        System.out.println(AC);
        System.out.println("BC uzunligi: ");
        int BC = C - B;
        System.out.println(BC);

        System.out.println("Kesmalar uzunligining yi'gindisi:  " + (AC + BC) + " ga teng");
    }
}
