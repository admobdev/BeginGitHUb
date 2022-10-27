import java.util.Scanner;

public class Begin21 {
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
        System.out.print("x3 tomoni: ");
        int x3 = sc.nextInt();
        System.out.print("y3 tomoni: ");
        int y3 = sc.nextInt();

        int a1 = x2 - x1;
        int a2 = y2 - y1;
        int b1 = x3 - x1;
        int b2 = y3 - y1;
        int c1 = x3 - x2;
        int c2 = y3 - y2;

        int a = (int) Math.sqrt(Math.pow(a1,2) + Math.pow(a2,2));
        int b = (int) Math.sqrt(Math.pow(b1,2) + Math.pow(b2,2));
        int c = (int) Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));

        int p = a + b + c;
        int p1 = ( a + b + c) / 2;
        int S = (int) Math.sqrt(p * (p - a ) * ( p - b ) * ( p - c ));
        System.out.println("Yuzasi: " + S);
        System.out.println("Perimetri: " + p);
    }
}
