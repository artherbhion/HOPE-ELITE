import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class generateParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int n=sc.nextInt();
        backtrack(list, "", 0, 0, n);
        System.out.println(list);
    }
    
    public static void backtrack(List<String> list, String str, int open, int close, int max){
        
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
}
