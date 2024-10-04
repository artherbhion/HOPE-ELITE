import java.util.Scanner;
public class average {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int avg=sc.nextInt();
        System.err.println(6*avg-m1-m2-m3-m4-m5);
    }
}
