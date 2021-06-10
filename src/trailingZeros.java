import java.util.*;

public class trailingZeros {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int twcount=0,ficount=0;

        int cp=n;
        while(cp>0){
            twcount++;
           cp=cp>>1;
        }
        while(n>0){
            ficount++;
            n/=5;
        }

        System.out.println(Math.min(twcount,ficount));
    }
}
