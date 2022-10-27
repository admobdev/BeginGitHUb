import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:  ");
        int a = sc.nextInt();

        int a2 = (int) Math.pow(a,2);
        int a4 = (int) Math.pow(a,4);
        int a8 = (int) Math.pow(a,8);
        
        System.out.println(a2);
        System.out.println(a4);
        System.out.println(a8);
    }
}
