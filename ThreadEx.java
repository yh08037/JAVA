
// Thread 사용 문법 두가지 방법
// (1) extends Thread
class MyThreadOne extends Thread {
    public void run() { // CallBack 메소드
        // 현재 Thread가 수행해야할 작업을 코딩
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

// (2) implements Runnable
class MyThreadTwo implements Runnable {

    @Override
    public void run() {// CallBack 메소드
        // 현재 Thread가 수행해야할 작업을 코딩
        for (int i = 100; i < 1000; i += 1) {
            System.out.println(i);
        }

    }
}

public class ThreadEx {
    public static void main(String[] args) {
        System.out.println("[Start]");

        MyThreadOne m1 = new MyThreadOne(); // Thread 객체화
//      m1.run();  <= CallBack 메소드이므로 직접 호출하면 안됨!!!
        // 이 경우 run 메소드를 main thread 가 수행하게됨
        m1.start(); //Thread 시작 => 바로 실행을 의미하지는 않음


        MyThreadTwo m2 = new MyThreadTwo();
        Thread m2t = new Thread();
        m2t.start();


        System.out.println("[End]");

    }
}
