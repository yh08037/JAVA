
class BankAccount {
    private String owner;
    private int accountNumber;
    private int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    public String toString() {
        return "현재 잔액은 " + balance + "입니다.";
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(10000);
        System.out.println(b);
        b.withdraw(2000);
        System.out.println(b);
    }
}
