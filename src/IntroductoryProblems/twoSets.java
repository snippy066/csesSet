import java.util.*;

public class twoSets {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long num=n*(n+1);
        StringBuilder sb=new StringBuilder();
        if(num%4==0){
            sb=series(n,num/4,sb);
           System.out.print("YES\n"+sb.toString());
        }
        else
            System.out.println("NO");
    }

    public static StringBuilder series(int n,long k,StringBuilder sb){
        StringBuilder st=new StringBuilder();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int i;
        int j = n;
        if (n % 2 == 0) {
            i = 1;
        } else {
            set1.add(1);
            set1.add(2);
            set2.add(3);
            i = 4;
        }
        while (i <= j) {
            set1.add(i);
            ++i;
            set2.add(i);
            ++i;
            set1.add(j);
            --j;
            set2.add(j);
            --j;
        }
        sb.append(set1.size()+"\n");
        for (int x : set1)
            sb.append(x).append(" ");
        sb.append("\n"+set2.size()+"\n");
        for (int x : set2)
            sb.append(x).append(" ");
        return sb;
    }
}
