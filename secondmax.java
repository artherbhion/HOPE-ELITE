import java.util.Scanner;
public class secondmax {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
          System.out.println("Enter no of Elements:");
          int n=s.nextInt();
          int[] nums=new int[n];
          System.out.println("Enter "+ n +" Elements:");
          for(int i=0;i<n;i++){
            nums[i]=s.nextInt();  
          }
          int max=Integer.MIN_VALUE+1;
          int secondmax=Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
            for(int i=0;i<n;i++){
            if (nums[i] > secondmax && nums[i] < max) {
                secondmax = nums[i];
            }
          }
          System.out.println(secondmax);
    }
}
