package KT;
import java.util.Scanner;
public class vowelsConsonants {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string  ");
        String abc=s.nextLine();
        int vowels=0,consonants=0;

        for(int i=0;i<abc.length();i++){
            if(abc.charAt(i)=='a'||abc.charAt(i)=='e'||abc.charAt(i)=='i'||abc.charAt(i)=='o'||abc.charAt(i)=='u'){
                vowels=vowels+1;
            }
            else{
                 consonants=consonants+1;
            }
        }
        System.out.println("total number of characters in string "+abc.length());
        System.out.println("number of Vowels = "+vowels);
        System.out.println("Number of consonants = "+consonants);
    }
}