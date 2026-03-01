public class ATM {

    private double balance;   // private variable

    // Constructor to set initial balance
    public ATM(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        ATM atm = new ATM(1000);   // Initial balance

        atm.deposit(500);
        atm.withdraw(300);
        atm.withdraw(2000);   // Not allowed

        System.out.println("Current Balance: " + atm.getBalance());
    }
}
