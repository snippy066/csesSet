import java.util.*;

public class coinPiles {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();

           // int sum=a+b;
            while(a!=0 && b!=0){
                a-=3;
                b-=3;
            }

            if(a==0 && b==0)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb.toString());
    }

}
