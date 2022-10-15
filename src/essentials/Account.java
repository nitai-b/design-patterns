package essentials;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    private void setBalance(float balance) {
        if (balance > 0)
            this.balance = balance;
    }

    public void deposit(float amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            this.balance -= amount;
    }
}
