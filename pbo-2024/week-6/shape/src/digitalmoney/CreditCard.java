package digitalmoney;

public interface CreditCard {
    void topUp(double amount);
    void pay(double amount);
    void topUp(double amount, String description);
    void transfer(DigitalMoney recipient, double amount);
    void debit(double amount);
    void credit(double amount);
}
