import java.util.HashMap;
import java. util.Scanner;
public class ShortestDuplicateSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                min=Math.min(min,i+1-map.get(i));
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(min==Integer.MAX_VALUE? -1:min);
    }
}