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
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb.toString());
    }

}
