package KT;

public class arraySumAverage {
    public static void main(String args[]){
      double a[] = {1,2,3,4,5,6,7,8,9,10};
      double s=a[0];
      for(int i=0;i<9;i++){
          s= s+a[i+1];
      }
      double average=s/10;
        System.out.println("sum of array elements "+s);
        System.out.println("average of array elements "+average);
    }
}
