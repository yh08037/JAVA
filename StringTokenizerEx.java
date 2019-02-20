import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String[] args) {

        String str = "3-2+8+5+1";

        StringTokenizer st = new StringTokenizer(str, "+-");

        String temp = "";
        int result = 0;

        while( st.hasMoreTokens() ) {
            temp = st.nextToken();
            // 문자열 -> int 형으로 변환
            result = result + Integer.parseInt(temp);
        }

        // 숫자형 -> 문자형으로 변환 : 숫자 + ""

        System.out.println("결과 = " + result);
    }
}
