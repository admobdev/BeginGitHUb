import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

         int D = (b * b) - (4 * a * c);
		double x1, x2;
		x1 =  (-b + Math.sqrt(D)) / (2 * a);
		x2 =  (-b - Math.sqrt(D)) / (2 * a);
		System.out.println(D);
		if (x2 < x1) {
		System.out.println("x2= " + x2);
		System.out.println("x1= " + x1);

		}
		else {
			System.out.println("x1= " + x1);
			System.out.println("x2= " + x2);
		}
    }
}
