package KT;

public class SwapWithoutThird {
    public static void main(String args []){
        int a=10, b=20;
        System.out.println("First value = "+a);
        System.out.println("Second value = "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped values are ");
        System.out.println("First value ="+a);
        System.out.println("Second value ="+b);
    }
}
