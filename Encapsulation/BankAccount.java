public class BankAccount {
    private double saldo;
    private String accountNumber;
    private String accountName;

    public BankAccount(double firstSaldo, String accountNumber, String accountName) {
        this.saldo = firstSaldo;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public void deposit(double amount) {
        this.saldo += amount;
    }

    public void withdraw(double amount) {
        this.saldo -= amount;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String toString() {
        return 
        "Account number: " + this.accountNumber + 
        "\nAccount name: " + this.accountName + 
        "\nSaldo: " + this.saldo;
    }
}

