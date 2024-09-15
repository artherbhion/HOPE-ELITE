import java.util.Scanner;

public class flowerpot {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter no of elements:");//
        int num=sc.nextInt();
        System.out.println("Enter elements:");//
        int [] nums=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("ENter no of Pots:");//
        int nofplant=sc.nextInt();
        System.out.println(canPlaceFlowers( nums,nofplant));


    }
    public  static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            int next=4,pre=4;
            if(flowerbed[i] == 0) {
                if(i==flowerbed.length-1){
                     next=0;
                }
                else{
                     next=flowerbed[i + 1];
                }
                if(i==0){
                     pre=0;
                }
                else{
                     pre=flowerbed[i-1];
                }
               if(next == 0 && pre == 0) {
                   flowerbed[i] = 1;
                   count++;
               }
            }
        }
        if(count>=n){
            return true;
        }
        
        return false;
    }
}
