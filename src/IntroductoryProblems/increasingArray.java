import java.util.*;

public class increasingArray {
    public static void main(String[] ar){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        int[] arr=new int[t];
       for(int i=0;i<t;i++)  arr[i]=in.nextInt();
      long count=0;
       for(int i=1;i<t;i++){
           if(arr[i-1]>arr[i]) {
               count += arr[i - 1] - arr[i];
               arr[i]=arr[i-1];
           }
       }
       System.out.println(count);
    }
}
