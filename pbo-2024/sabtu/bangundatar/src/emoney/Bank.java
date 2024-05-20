package emoney;
public interface Bank {
    String getNomerAccount();
    void transfer(int amount, String accountNumber);
}
