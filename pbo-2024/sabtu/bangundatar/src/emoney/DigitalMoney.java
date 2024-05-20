package emoney;
public interface DigitalMoney {
    void topUp(int amount);
    void pay(int amount);
    void checkBalance();
    void withdraw(int amount);
    void transfer(int amount, String accountNumber);
}