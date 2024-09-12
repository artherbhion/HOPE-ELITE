import java.util.Scanner;

public class rotatearray
{
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of Elements:");
        int n=s.nextInt();
        System.out.println("Enter Times to rotate:");
        int x=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=s.nextInt();  
        }
        x=x%arr.length;
        s.close();
   }

}
