
// 이런 식의 코드는 사용하지 말 것!!!

class Outter {
    int x = 0;

    class Inner {
        int y = 10;
        public void printX() {
            System.out.println(x);
        }
    }
}


public class InnerEx {
    public static void main(String[] args) {
//        new Inner();  내부 클래스는 단독으로 객체화가 불가능하다!!!
        // 내부클래스를 쓸려면 외부클래스가 먼저 객체화 되어있어야!!!

        Outter o = new Outter();
        Outter.Inner i = o.new Inner();
    }
}
