import java.util.*;


public class towerOfHan {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        tower(n,"1","2","3");
        System.out.println(Math.pow(2,n)-1+"\n"+sb);
    }
    static void tower(int n,String sr,String aux,String des){
        if(n==1)
            sb.append(sr+" "+des+"\n");
        tower(n-1,sr,aux,des);
        sb.append(sr+" "+des+"\n");
        tower(n-1,aux,des,sr);
    }
}
