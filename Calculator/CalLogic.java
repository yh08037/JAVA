import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

class CalLogic {

    String evaluate(String str) {
        return evalPostfix(convertNotation(str)) + "";    // this. 생략
    }

    private Queue<String> convertNotation(String str) {
        Stack<String> opStack = new Stack<>();
        Queue<String> result = new LinkedList<>();
        StringTokenizer stk = new StringTokenizer(str, "()+-*/", true);
        String temp;

        while (stk.hasMoreTokens()) {
            temp = stk.nextToken();
            switch (temp) {
                case "(":
                    // "("를 만나면 스택에 푸시한다.
                    opStack.push(temp);
                    break;

                case ")":
                    // ")"를 만나면 스택에서 "("가 나올 때까지 팝하여 저장하고, "("는 팝하여 버린다.
                    while (!opStack.peek().equals("(")) {
                        result.offer(opStack.pop());
                    }
                    opStack.pop();    //opStack 에서 "(" 제거
                    break;

                case "+":
                case "-":
                case "*":
                case "/":
                    // 연산자를 만나면 스택에서 그 연산자보다 낮은 우선순위의 연산자를
                    // 만날 때까지 팝하여 저장한 뒤 자신을 푸시한다.
                    while (!opStack.empty() && opOrder(opStack.peek()) >= opOrder(temp)) {
                        result.offer(opStack.pop());
                    }
                    opStack.push(temp);
                    break;

                default:
                    // 숫자는 그냥 저장한다.
                    result.offer(temp);
            }
        }

        // 모든 스트링토큰이 끝나면 스택에 있는 연산자들을 모두 팝하여 저장한다.
        while (!opStack.empty()) {
            result.offer(opStack.pop());
        }

        return result;
    }

    // 연산자들의 우선순위를 배정한다.
    private static int opOrder(String operator) {
        switch (operator) {
            case "+":
            case "_":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return -1;
        }
    }

    // 후치연산식을 계산하여 값을 반환한다.
    private double evalPostfix(Queue<String> postfixQueue) {

        Stack<Double> evalStack = new Stack<>();

        for (String s : postfixQueue) {
            switch (s) {
                // 연산자를 만나면 스택에서 팝을 두번하여 그 두 데이터로 연산한 다음 스택에 다시 저장한다.
                case "+":
                    evalStack.push(evalStack.pop() + evalStack.pop());
                    break;
                case "-":
                    evalStack.push(-evalStack.pop() + evalStack.pop());
                    break;
                case "*":
                    evalStack.push(evalStack.pop() * evalStack.pop());
                    break;
                case "/":
                    double num1 = evalStack.pop();
                    double num2 = evalStack.pop();
                    evalStack.push(num2 / num1);
                    break;
                default:
                    // 숫자를 만나면 숫자는 스택에 푸시한다.
                    evalStack.push(Double.parseDouble(s));
            }
        }
        return evalStack.peek();
    }
}