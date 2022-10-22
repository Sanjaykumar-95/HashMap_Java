import java.util.*;
import java.util.HashMap;
import java.util.Map;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        for(int i=0;i<n;i++) System.out.print(ar[i]+" ");
        System.out.println();
        Arrays.sort(ar);
        for(int i=0;i<n;i++) System.out.print(ar[i]+" ");
        //Creating HashMap
        HashMap<Integer,Integer> hm=new HashMap<>();
        //Inserting elements into HashMap
        for(int i=0;i<n;i++) hm.put(ar[i],i);
        //Printing HashMap
        System.out.println("HashMap "+hm);
        //Size of HashMap
        System.out.println("Size of HashMap "+hm.size());
        //Printing values from an HashMap
        System.out.println("HashMap values "+hm.values());
        //Printing Keys from HashMap
        System.out.println("HashMap Keys "+hm.keySet());
    }
}