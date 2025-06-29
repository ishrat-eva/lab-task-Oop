package labtask;

abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public double getBalance() {
        return balance;
    }

    public abstract boolean canTransfer(Account toAccount);

    public void transferTo(Account toAccount, double amount) {
        if (!this.canTransfer(toAccount)) {
            System.out.println("Transfer not allowed from this account.");
            return;
        }
        if (this.balance >= amount) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Not enough balance to transfer.");
        }
    }

    public abstract void applyInterest();
}

