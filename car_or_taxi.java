import java.util.Scanner;
public class car_or_taxi{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("money for driver:");
        int x=sc.nextInt();
        System.out.println("Mileage:");
        int y=sc.nextInt();
        System.out.println("petrol cost:");
        int z=sc.nextInt();
        System.out.println("Total Distance:");
        int v=sc.nextInt();
        System.out.println("Money for Call Taxi:");
        int w=sc.nextInt();
        int car=(v/y)*z+x;
        int calltaxi=(v-3)*w+50;  
        System.out.println("Car cost:"+car);
        System.out.println("Call cost:"+calltaxi);
        System.out.println(car<calltaxi?"Go in car":calltaxi+"Go in calltaxi"); 
    }
}
