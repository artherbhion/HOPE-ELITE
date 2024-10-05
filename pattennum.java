import java.util.Scanner;
public class pattennum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  n=sc.nextInt();
        int curr=2,inc=8;
        int count=0;
        System.out.print(curr+" ");
        for(int i=1;i<=n;i++){
            // curr=curr+inc;
            System.out.print(curr+" ");
            // count++;
            // if(count>=2){
            //     inc=inc+8;
            //     count=0;
            // }
            curr=curr+1;
        }
            
      
    }
}
