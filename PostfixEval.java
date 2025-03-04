import java.util.Stack;

public class PostfixEval {
    public static void main(String[] args) {
        String exp = "4325*-+";
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                stk.push(ch - '0');
            } else {
                int b = stk.pop();
                int a = stk.pop();
                int res = 0;

                switch (ch) {
                    case '+':
                        res = a + b;
                        break;
                    case '-':
                        res = a - b;
                        break;
                    case '*':
                        res = a * b;
                        break;
                    case '/':
                        res = a / b;
                        break;
                }

                stk.push(res);
            }
        }

        int res = stk.pop();
        System.out.println(res);
    }
}
