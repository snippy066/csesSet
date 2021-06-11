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
                int k=hm.get(s[i])+1;
                //System.out.println(k);
                hm.put(s[i],k);
            }
            else
                hm.put(s[i],1);
        }

        int oddCount=0,flag=0;
        String ch="",firsth="",secondh="";
        for(Map.Entry mp :hm.entrySet()){
            if((int)mp.getValue()%2!=0){
                oddCount++;
                flag++;
                ch=(String)mp.getKey();
            }

            if(flag>1)
                break;
        }

        if(flag>1)
            System.out.println("NO SOLUTION");
        else if(flag>0 && n%2==0)
            System.out.println("NO SOLUTION");
        else{
            for(Map.Entry mp :hm.entrySet()) {
                String s1="";
                int cnt=(int)mp.getValue()/2;
                while(cnt-->0){
                    s1=s1+(String) mp.getKey();
                }
                firsth+=s1;
                secondh=s1+secondh;
            }
            if(oddCount==1)
                System.out.println(firsth+ch+secondh);
            else
                System.out.println(firsth+secondh);
        }

    }
}
