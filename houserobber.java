import java.util.ArrayList;
import java.util.Scanner;

public class houserobber {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
          System.out.println("Enter no of Elements:");
          int n=s.nextInt();
          int[] nums=new int[n];
          System.out.println("Enter "+ n +" Elements:");
          for(int i=0;i<n;i++){
            nums[i]=s.nextInt();  
          }
    if(nums.length<2){
        System.out.println(nums[0]);
    }
    ArrayList<Integer> dp=new ArrayList<Integer>();
    dp.add(nums[0]);
    dp.add(Math.max(nums[0],nums[1]));
    for(int i=2;i<nums.length;i++){
        dp.add(Math.max(dp.get(i-1),(dp.get(i-2)+nums[i])));

    }
    System.out.print(dp.get(dp.size()-1));
}
}