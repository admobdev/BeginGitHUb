import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 tomoni: ");
        int x1 = sc.nextInt();
        System.out.print("y1 tomoni: ");
        int y1 = sc.nextInt();
        System.out.print("x2 tomoni: ");
        int x2 = sc.nextInt();
        System.out.print("y2 tomoni: ");
        int y2 = sc.nextInt();

        int x = x2 -x1;
        int y = y2 -y1;
        int masofa =  (int) Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Masofa: " + masofa);
    }
}
