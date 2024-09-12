import java.util.Scanner;

public class longestsubsequence
{
	public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
          System.out.println("Enter no of Elements:");
          int no=s.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=s.nextInt();  
          }
          int[] temp=new int[n];
          for(int i=0;i<n;i++){
              temp[i]=1;
            }
          for(int i=1;i<n;i++){
              for(int j=0;j<i;j++){
                  if(arr[j]<arr[i]){
                      temp[i]=temp[j]+1;
                  }
              }
          }int max=1;
          for(int i=0;i<n;i++){
            max=Math.max(max,temp[i]);
          }
System.out.println(max);
        }
        }
	}

