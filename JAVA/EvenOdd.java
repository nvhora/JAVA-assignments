package KT;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);

        System.out.println("enter a valid number ");
        int a=s.nextInt();

        if(a%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}