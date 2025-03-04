import java.util.HashMap;
import java.util.Scanner;
public class LuckyDirection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<String,String> map=new HashMap<>();
        map.put("N","S");
        map.put("S","N");
        map.put("E","W");
        map.put("W","E");
        map.put("NE","SW");
        map.put("NW","SE");
        map.put("SE","NW");
        map.put("SW","NE");
        System.out.println(map.get(str));
    }
}
