import java.util.Scanner;
public class profit{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        
        System.out.print(a-(a*b/100));               
    }
}