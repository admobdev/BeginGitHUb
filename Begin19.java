import java.util.Scanner;

public class Begin19 {
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

        int St1 = x2 - x1;
		int St2 = y2 - y1;
		int P = (Math.abs(St1) + Math.abs(St2)) * 2;
		int S = (Math.abs(St1) * Math.abs(St2));
        System.out.println("Yuzasi: " + S);
        System.out.print("Perimetri: " + P);
    }
}
