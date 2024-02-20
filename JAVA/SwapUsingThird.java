package KT;
public class SwapUsingThird {
    public static void main(String args[])
    {
        int a=10, b=20, c=a;
        System.out.println("First value ="+a);
        System.out.println("Second value ="+b);

        a=b;
        b=c;
        c=a;

        System.out.println("\n Swapped values are ");
        System.out.println("First value ="+a);
        System.out.println("Second value ="+b);
    }
}