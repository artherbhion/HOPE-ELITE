public class monkey {
    public static void main(String[] args) {
        int[] arr= new int [100];
        for(int i=0;i<100;i++){
            arr[i]=1;
        }
        for(int i=0;i<100;i++){
            if((i+1)%2==0){
                arr[i]=0;
            }
        }
        for(int i=3;i<=100;i++){
            for(int j=0;j<100;j++){
                if(i%(j+1)==0){
                    if(arr[j]==1){
                        arr[j]=0;
                    }
                    else{
                        arr[j]=1;
                    }
                }
            }
        }
        int c=0;
        for(int i=0;i<100;i++){
            if(arr[i]==1){
                c++;
            }
        }
        System.out.println(c);
    }
}
