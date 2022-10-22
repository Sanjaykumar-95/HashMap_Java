//Printing Unique elements from an array using HashMap
import java.util.*;
import java.util.HashMap;
import java.util.Map;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int [n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        //Creatig HashMap
        HashMap<Integer,Integer> hm=new HashMap<>();
        //Inserting into HashMap
        for(int i=0;i<n;i++){
            if(hm.containsKey(ar[i])){
                hm.replace(ar[i],hm.get(ar[i])+1); //Increasing count of the element
            }
            else hm.put(ar[i],1);
        }
        //Printing HashMap
        System.out.println(hm);
        //Printing unique elements
        for(Map.Entry<Integer,Integer> ele : hm.entrySet()){
            if(ele.getValue()==1){
                System.out.println("Unique Elements are: "+ele.getKey());
            }
        }

        //repeated elements in an array
        for(Map.Entry<Integer,Integer> ele: hm.entrySet()){
            if(ele.getValue()>1){
                System.out.println("Repeated elements are: "+ele.getKey());
            }
        }
    }
}