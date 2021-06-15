import java.util.*;

public class palidromReorder {
    private static HashMap<Character,Integer> hm;
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();
        char[] ch=new char[st.length()];
        for(int i=0;i<st.length();i++)
            ch[i]=st.charAt(i);
        getpalindrom(ch,st.length());
    }

    static void getpalindrom(char[] s,int n){
        hm=new HashMap<Character,Integer>();

        for(int i=0;i<n;i++){
            if(hm.containsKey(s[i]))
                hm.put(s[i],hm.get(s[i])+1);

            else
                hm.put(s[i],1);
        }

        int oddCount=0,flag=0;
        String ch="",firsth="",secondh="";
        for(Map.Entry mp :hm.entrySet()){
            if((int)mp.getValue()%2!=0){
                oddCount++;
                flag++;
                ch=Character.toString((Character)mp.getKey());
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
                String s1;
                int cnt=(int)mp.getValue()/2;
                char fil=(Character)mp.getKey();
               // System.out.println(fil);
                char[] arr=new char[cnt];
                Arrays.fill(arr,fil);

                s1=new String(arr);
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
