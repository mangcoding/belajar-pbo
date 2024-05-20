package emoney;
public class Dana implements DigitalMoney, Bank {
    private String nomerAccount;

    public Dana(String nomerAccount) {
        this.nomerAccount = nomerAccount;
    }

    public void topUp(int amount) {
        System.out.println("Top up: " + amount);
    }

    public String getNomerAccount() {
        return nomerAccount;
    }
    public void pay(int amount) {
        System.out.println("Pay: " + amount);
    }

    public void checkBalance() {
        System.out.println("Check balance");
    }

    public void withdraw(int amount) {
        System.out.println("Withdraw: " + amount);
    }

    public void transfer(int amount, String accountNumber) {
        System.out.println("Transfer: " + amount + " to " + accountNumber);
    }
}