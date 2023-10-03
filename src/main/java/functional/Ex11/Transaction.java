package functional.Ex11;

public class Transaction {

    private int id;
    private int amount;

    private Account account;

    public Transaction(int id, int amount, Account account) {
        this.id = id;
        this.amount = amount;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }
}
