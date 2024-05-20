package emoney;
public interface Bank {
    void openAccount();
    void closeAccount();
    void checkBalance();
    void checkTransactionHistory();
    void send();
    void withdraw();
    void payWithCheck();
}
