import java.util.Scanner;
public class ground{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("length : "+(2*l+2*b));
        System.out.println("quality : "+(l*b));
               
    }
}
