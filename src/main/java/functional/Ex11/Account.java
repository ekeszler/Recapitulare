package functional.Ex11;

public class Account {

    private String accountNumber;
    private int ballance;

    public Account(String accountNumber, int ballance) {
        this.accountNumber = accountNumber;
        this.ballance = ballance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ballance=" + ballance +
                '}';
    }
}
