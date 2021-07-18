import java.util.*;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    private static HashSet<String> hs=new HashSet<>();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        String arr=in.nextLine();
        int n=arr.length();

        permute(arr,0,n-1);

        List<String> li=new ArrayList<>(hs);
        Collections.sort(li);

        System.out.println(li.size());
        for(String st:li)
            sb.append(st+"\n");

        System.out.println(sb.toString());
    }

    static void permute(String a,int l,int r){
        if(l==r)
            hs.add(a);
        else{

            for(int i=l;i<=r;i++){
                char s1[]=a.toCharArray();
                a=swap(s1,l,i);
                permute(a,l+1,r);
                a=swap(s1,l,i);
            }
        }
    }
    static String swap(char[] a,int l, int r ){
       char tem=a[l];
       a[l]=a[r];
       a[r]=tem;

       return String.valueOf(a);
    }
}
