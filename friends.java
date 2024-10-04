import java.util.Scanner;
public class friends{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=(x1+x2)/2;
        int y3=(y1+y2)/2;
        System.out.print(x3+" "+ y3);               
    }
}
