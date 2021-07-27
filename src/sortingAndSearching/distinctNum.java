//package sortingAndSearching;

import java.util.HashMap;
import java.util.Scanner;

public class distinctNum {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        HashMap<Integer,Integer> hs=new HashMap<>();

        for(int i=0;i<n;i++){
            int key=in.nextInt();

            if(hs.containsKey(key)){
                hs.put(key,hs.get(key)+1);
            }
            else
                hs.put(key,1);
        }
        System.out.println(hs.size());
    }
}
