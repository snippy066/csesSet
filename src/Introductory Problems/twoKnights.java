import java.util.*;

public class twoKnights {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++) {
            stopAttack(i, sb);
        }
        System.out.print(sb);
    }

    public static StringBuilder stopAttack(int k,StringBuilder sb){
        long val=(long)k*k;
        long wayMove=(val*(val-1))/2;
        long attack=4*(k-1)*(k-2);
        sb.append(wayMove-attack+"\n");
        return sb;
    }
}
