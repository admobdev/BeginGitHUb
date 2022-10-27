import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Kubning yon tomooni: ");
        int a = sc.nextInt();

        int V = (int) Math.pow(a,3);
        int S = (int) (6 * Math.pow(a,2));
        System.out.println("Hajmi: " + V);
        System.out.print("To'la sirti: " + S);
    }
}
