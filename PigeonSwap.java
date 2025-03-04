import java.util.Scanner;
public class PigeonSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] ploc=new int[n+1];
        int[] nest=new int[n+1];
        int[] swaploc=new int[n+1];
        for (int i=1;i<=n;i++) {
            ploc[i]=i;
            nest[i]=i;
        }
        while (q-->0){
            int qt=sc.nextInt();
            if (qt==1) {
                int pigeon=sc.nextInt();
                int destination=sc.nextInt();
                ploc[pigeon]=nest[destination];
            } else if (qt==2) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int aswap=swaploc[a];
                int bswap=swaploc[b];

                int temp=swaploc[a];
                swaploc[a]=swaploc[b];
                swaploc[b]=temp;
                

            } else if (qt==3) {
                int pigeon=sc.nextInt();
                System.out.println(ploc[pigeon]);
            }
        }
    }
}
