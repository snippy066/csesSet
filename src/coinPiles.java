import java.util.*;

public class coinPiles {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            
            int sum=a+b;

            if(sum%3==0)
                sb.append("YES");
            else
                sb.append("NO");
        }
        System.out.println(sb.toString());
    }

}
