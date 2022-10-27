import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:  ");
        int a = sc.nextInt();

        int a2 = (int) Math.pow(a,2);
        int a3 = (int) Math.pow(a,3);
        int a5 = (int) Math.pow(a,5);
        int a10 = (int) Math.pow(a,10);
        int a15 = (int) Math.pow(a,15);

        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a5);
        System.out.println(a10);
        System.out.println(a15);
    }
}
