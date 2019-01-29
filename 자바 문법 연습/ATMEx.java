
class ATM implements Runnable {

    private long depositMoney = 10000;

    @Override
//    public void run() {
//    public synchronized void run() {  //  동기화 : 비공정성 문제 발생!!
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (getDepositMoney() <= 0)
                    break;
                withDraw(1000);
            }
        }
    }

    void withDraw(long howMuch) {
        if (getDepositMoney() > 0) {
            depositMoney -= howMuch;
            System.out.print(Thread.currentThread().getName() + ", ");
            System.out.printf("잔액 : %,d원 %n", getDepositMoney());
        } else {
            depositMoney -= howMuch;
            System.out.print(Thread.currentThread().getName() + ", ");
            System.out.print("잔액이 부족합니다");
        }
    }

    public long getDepositMoney() {
        return depositMoney;
    }
}

public class ATMEx {
    public static void main(String[] args) {
        ATM a = new ATM();
        Thread mother = new Thread(a, "mother");
        mother.start();

//        ATM b = new ATM();
        Thread son = new Thread(a, "son");   // 두개의 Thread 가 하나의 자원을 공유해서 사용 => 동기화 문제!!
        son.start();
    }
}
