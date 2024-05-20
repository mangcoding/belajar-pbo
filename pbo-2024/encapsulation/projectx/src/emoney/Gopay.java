package emoney;
public class Gopay implements Bank, DigitalMoney {
    public void openAccount() {
        System.out.println("Open Gopay account");
    }

    public void closeAccountx() {
        System.out.println("Close Gopay account");
    }

    public void closeAccount() {
        System.out.println("Close Gopay account");
    }

    public void checkBalance() {
        System.out.println("Check Gopay balance");
    }

    public void checkTransactionHistory() {
        System.out.println("Check Gopay transaction history");
    }

    public void send() {
        System.out.println("Send money with Gopay");
    }

    public void withdraw() {
        System.out.println("Withdraw money from Gopay");
    }

    public void payWithCheck() {
        System.out.println("Pay with Gopay check");
    }

    public void topUp() {
        System.out.println("Top up Gopay balance");
    }

    public void pay() {
        System.out.println("Pay with Gopay");
    }

    public void transfer() {
        System.out.println("Transfer money with Gopay");
    }
}
