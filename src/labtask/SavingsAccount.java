package labtask;

class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Must keep at least 1000 balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public boolean canTransfer(Account toAccount) {
        return (balance > 1000);
    }

    public void applyInterest() {
        balance += balance * 0.025;
    }
}

