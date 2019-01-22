import java.util.StringTokenizer;

class CalLogic {
    String str; //게산식 저장을 위한 변수
    public String cal(String str) {

        StringTokenizer stk = new StringTokenizer(str, "+-*/", true);
        int result = 0;
        String temp = "";
        while (stk.hasMoreTokens()) {
            temp = stk.nextToken();
            if (temp.equals("+")) {
                result = result + Integer.parseInt(stk.nextToken());
            }else if (temp.equals("-")) {
                result = result - Integer.parseInt(stk.nextToken());
            }else if (temp.equals("*")) {
                result = result * Integer.parseInt(stk.nextToken());
            }else if (temp.equals("/")) {
                result = result / Integer.parseInt(stk.nextToken());
            }else {
                result = Integer.parseInt(temp);
            }
        }
        return result+"";
    }

}
//
//public class CalLogic {
//
//    public static void main(String[] args) {
//
//        MyCalLogic m = new MyCalLogic();
//        String result = m.cal("3+2*1-1");
//
//        System.out.println(result);
//    }
//}
