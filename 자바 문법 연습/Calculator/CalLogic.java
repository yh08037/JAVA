import java.util.StringTokenizer;

public class CalLogic {
    public String cal(String str) {
        StringTokenizer stk = new StringTokenizer(str, "+-*/", true);
        int result = 0;
        String temp = "";
        while (stk.hasMoreTokens()) {
            temp = stk.nextToken();
            switch (temp) {
                case "+":
                    result += Integer.parseInt(stk.nextToken());
                    break;
                case "-":
                    result -= Integer.parseInt(stk.nextToken());
                    break;
                case "*":
                    result *= Integer.parseInt(stk.nextToken());
                    break;
                case "/":
                    result /= Integer.parseInt(stk.nextToken());
                    break;
                default:
                    result = Integer.parseInt(temp);
            }
        }
        return result+"";
    }

}
