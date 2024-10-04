import java.util.Scanner;
public class summa{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("num:");
        int num=sc.nextInt();
       int x= num>>1;
        System.out.println("x:"+x);     
        System.out.println("num:"+num);   
    }
}
//  16 8 4 2 1
    //   1 0 1  
     //  0 0 1