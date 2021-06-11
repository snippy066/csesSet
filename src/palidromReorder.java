import java.util.*;

public class palidromReorder {
    private static HashMap<String,Integer> hm;
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();
        String arr[]=new String[st.length()];
        for(int i=0;i<st.length();i++)
            arr[i]=st.charAt(i)+"";
        getpalindrom(arr,st.length());
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

//        for(Map.Entry mp :hm.entrySet()){
//            System.out.println((String)mp.getKey()+" "+(int)mp.getValue());
//        }
        int oddCount=0,flag=0;
        String ch="",firsth="",secondh="";
        for(Map.Entry mp :hm.entrySet()){
            if((int)mp.getValue()%2!=0){
                oddCount++;
                flag++;
                ch=(String)mp.getKey();
            }
           // System.out.println(mp.getValue());
            if(flag>1)
                break;
        }

        if(flag>1)
            System.out.println("NO SOLUTION");
        else if(flag>0 && n%2==0)
            System.out.println("NO SOLUTION");
        else{
            for(Map.Entry mp :hm.entrySet()) {
                String str = new String(new char[(int)mp.getValue()/2]);
                str=str.replace('\0',(Character)mp.getKey());

                firsth+=s;
                secondh=s+secondh;
            }
            if(oddCount==1)
                System.out.println(firsth+ch+secondh);
            else
                System.out.println(firsth+secondh);
        }
    }
}
