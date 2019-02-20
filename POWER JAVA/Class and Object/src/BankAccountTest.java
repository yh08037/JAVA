
class BankAccount {
    int balance;
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if (balance < amount) {
            return;
        }
        balance -= amount;
    }
    int getBalance() {
        return balance;
    }
    void addInterest() {
        balance = balance * 1075 / 1000;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.balance = 100;
        bankAccount.deposit(1900);
        System.out.println(bankAccount.getBalance());

        bankAccount.addInterest();
        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(10000);
        System.out.println(bankAccount.getBalance());

    }
}
