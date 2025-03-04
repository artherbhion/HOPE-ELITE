import java.util.Scanner;
public class PigeonholeQuery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] ncount= new int[n+1];     
        int[] ploc=new int[n+1];
        for(int i=1;i<n;i++){
            ncount[i] = 1;
            ploc[i] = i;
        }
        int qt=0,pig=0,dest=0,mul=0;
        while(q-->0){
            qt=sc.nextInt();
            if(qt==1){
                pig=sc.nextInt();
                dest=sc.nextInt();
                int curr=ploc[pig];
                ncount[curr]--;
                if(ncount[curr]==1){
                    mul--;
                }
                if(++ncount[dest]==2){
                    mul++;
                }
                ploc[pig]=dest;
            }
            if(qt==2){
               System.out.println(mul);
            }
        }
    }
}
