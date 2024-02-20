package KT;
import java.util.Scanner;
public class stringReverseFor {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string ");
        String abc=s.nextLine();

        for(int i=abc.length()-1;i>=0;i--){
            System.out.println(abc.charAt(i));
        }
    }
}
