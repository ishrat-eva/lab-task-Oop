package labtask;

class CurrentAccount extends Account {

    public CurrentAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public boolean canTransfer(Account toAccount) {
        return true;
    }

    public void applyInterest() {

    }
}
