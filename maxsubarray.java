import java.util.Scanner;

public class maxsubarray
{
	public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
          System.out.println("Enter no of Elements:");
          int n=s.nextInt();
          int[] nums=new int[n];
          for(int i=0;i<n;i++){
            nums[i]=s.nextInt();  
          }
          int cursum=0,max=Integer.MIN_VALUE;
        if(nums.length==1){
          System.out.println(nums[0]);
        }
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            if(cursum>max){
                max=cursum;
            }
            if(cursum<0){
                if(cursum<0 && max==0){
                max=cursum;
                cursum=0;
            }   else{
                cursum=0;
                }
            }
        }
        if(max<0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0&& max<0){
                max=0;
            }
            }
        }
        System.out.println(max);
        }
	}
}
