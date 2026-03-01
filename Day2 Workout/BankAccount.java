class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Chandrika";
        b.balance = 1000;
        b.deposit(500);
        b.withdraw(200);
        b.display();
    }
}
