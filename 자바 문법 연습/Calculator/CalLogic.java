import java.util.ArrayList;
import java.util.StringTokenizer;

class Stack extends ArrayList<String> {
    String pop() {
        return this.remove(this.size()-1);
    }
}

class MyCalLogic {
//    String cal(String str) {
//
//        return result+"";
//    }

    ArrayList<String> convertNotation(String str) {
        Stack operatorStack = new Stack();
        StringTokenizer stk = new StringTokenizer(str, "()+-*/", true);
        ArrayList<String> result = new ArrayList<>();
        String temp = "";

        while (stk.hasMoreTokens()) {
            temp = stk.nextToken();
            switch (temp) {
                case "(":
                    operatorStack.add(temp);
                    break;

                case ")":
                    String tmp = "";
                    while (true) {
                        tmp = operatorStack.pop();
                        if (tmp.equals("(")) {
                            break;
                        } else {
                            result.add(tmp);
                        }
                    }
                    break;

                case "+":
                case "-":
                    break;

                case "*":
                case "/":
                    break;
//
//                case "+":
//                    result += Integer.parseInt(stk.nextToken());
//                    break;
//                case "-":
//                    result -= Integer.parseInt(stk.nextToken());
//                    break;
//                case "*":
//                    result *= Integer.parseInt(stk.nextToken());
//                    break;
//                case "/":
//                    result /= Integer.parseInt(stk.nextToken());
//                    break;
                default:
                    result.add(temp);
            }
        }

        while (operatorStack.size() != 0) {
            result.add(operatorStack.pop());
        }

        return result;
    }
}

public class CalLogic {
    public static void main(String[] args) {
        MyCalLogic myCalLogic = new MyCalLogic();
        System.out.println(myCalLogic.convertNotation("(2*(3+6/2)+2)/4+3"));
    }
}
