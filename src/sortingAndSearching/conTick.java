//package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class conTick {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();

        int price[]=new int[n];
        int max[]=new int[m];

        in.nextLine();
        String[] s1=in.nextLine().split(" ");
        String [] s2=in.nextLine().split(" ");

        for(int i=0;i<n;i++) price[i] = Integer.parseInt(s1[i]);
        for(int i=0;i<m;i++) max[i] = Integer.parseInt(s2[i]);

        Arrays.sort(price);

        String s=String.valueOf(getUserPrices(price,max));
        System.out.println(s);
    }
    static int[] getUserPrices(int[] prices, int[] bids) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for ( int price : prices ) {
            if ( tree.containsKey(price) ) {
                tree.put(price, tree.get(price) + 1);
            } else {
                tree.put(price, 1);
            }
        }

        int[] result = new int[bids.length];
        for ( int i = 0; i < bids.length; i++ ) {
            Integer k = tree.floorKey(bids[i]);
            if ( k != null ) {
                result[i] = k;
                int value = tree.get(k);
                if ( value-1 > 0 ) {
                    tree.put(k, value-1);
                } else {
                    tree.remove(k);
                }
            } else {
                result[i]= -1;
            }
        }

        return result;
    }
}
