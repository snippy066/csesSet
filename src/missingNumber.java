import java.util.*;


public class missingNumber {
    public static void main(String ar[]){
        Scanner in =new Scanner(System.in);

        int n=in.nextInt();
        long sum=0,csum=0;

        for(int i=0;i<n-1;i++)
            sum+=in.nextInt();

        csum=(long)n*(n+1)/2;
        System.out.println(csum-sum);

    }
}
