package KT;
import java.util.Scanner;
public class LargestAmong3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter three numbers ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a>b && a>c) {
            System.out.println(a + "is the greater no ");
        } else if (b>a && b>c) {
            System.out.println(b + "is the greater no ");
        } else if (c>a && c>b) {
            System.out.println(c + "is the greater no ");
        } else {
            System.out.println("numbers are equal");
        }
    }
}