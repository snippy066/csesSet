import java.util.*;

public class trailingZeros {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        for(int i=5;n/i>=1;i*=5)
            count+=n/i;
        System.out.println(count);
    }
}
