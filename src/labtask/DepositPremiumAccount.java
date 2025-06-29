package labtask;
class DepositPremiumAccount extends Account {
    private int installmentsPaidNum;
    private static final int installmentNum = 5;

    public DepositPremiumAccount(double balance) {
        super(balance);
        this.installmentsPaidNum = 0;
    }

    public void payInstallment(double amount) {
        deposit(amount);
        installmentsPaidNum++;
        System.out.println("Installment paid. (" + installmentsPaidNum + "/" + installmentNum + ")");
    }

    public void withdraw(double amount) {
        if (installmentsPaidNum >= installmentNum) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Cannot withdraw before 5 installments.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean canTransfer(Account toAccount) {
        return false;
    }

    public void applyInterest() {
        if (installmentsPaidNum >= installmentNum) {
            balance += balance * 0.07;
        }
    }
}
