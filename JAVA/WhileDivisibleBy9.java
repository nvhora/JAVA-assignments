package KT;

public class WhileDivisibleBy9 {
    public static void main(String args[]){
        int i=1;
        while (i<=80){
            if(i%9==0)
            System.out.println(i);
            i++;
        }
    }
}
