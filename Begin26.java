import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X:  ");
        int x = sc.nextInt();

        int x1 = x - 3;
        int y = (int) (4 * Math.pow(x1,5) - 7 * Math.pow(x1,3) + 2);
        System.out.println("Javob: " + y);
    }
}
