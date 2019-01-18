public class StringEx {
    public static void main(String[] args){
        // String 클래스의 두 가지 특징
        // (1) 암시적인 객체 생성 지원
        // (2) 불변적 특징을 가짐


        // (1) String 클래스는 암시적인 객체 생성 지원
        String str1 = "ABC";    //new String("ABC");
        String str2 = "ABC";

        // 암시적인 객체 생성을 통해 만들어질때는
        // 만약 똑같은 문자열이 먼저 만들어져 있다면
        // 그 String 객체의 주솟값을 가져와 저장한다.

//      String str1 = new String("ABC");
//      String str2 = new String("ABC");
        // 위와 같이 명시적으로 String 객체를 생성했다면
        // 아래 str1 == str2 은 "다르다"를 출력할 것이다.

//      if ( str1 == str2 ){    // 이는 문자열의 주솟값을 비교하는 코드
        if ( str1.equals(str2) ){   // 문자열 값 비교를 위해 사용
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }

        // (2) 불변적 특징을 가짐
        String str3 = "ABC";
        str3 = str3 + "DEF";    //메모리에는 "ABC", "ABCDEF" 두가지 존재

        // 자바에서는 문법적으로 객체 해재가 존재하지 않음
        // 대신 Garbage Collector 가 불필요한 메모리 자원을 해제해준다.

        // 따라서 String 클래스를 변경이 빈번하게 일어나는 문자열의 저장을 위해 사용하면
        // 성능 저하 또는 불필요한 메모리릭 문제가 발셍할 수 있다.
        // 하드웨어 자원이 PC에 비해 상대적으로 부족한 모바일에서는
        // 문자열 변경이 자주 일어나는 경우에 String 클래스를 사용하지 말 것
        // 대신에 StringBuffer 클래스 등을 사용할 수 있다.



    }
}
