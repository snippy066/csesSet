import java.util.*;

public class palidromReorder {
    private static HashMap<String,Integer> hm;
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        String st[]=sc.nextLine().split("");
        getpalindrom(st,st.length);
    }

    static void getpalindrom(String[] s,int n){
        hm=new HashMap<String,Integer>();

        for(int i=0;i<n;i++){
            if(hm.containsKey(s[i])){
                int k=hm.get(s[i]);
                hm.put(s[i],k++);
            }
            else
                hm.put(s[i],1);
        }
    }
}
