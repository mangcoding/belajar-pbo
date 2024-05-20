package digitalmoney;
public class NusaputraPay implements DigitalMoney, CreditCard {
    public void topUp(double amount, String decription) {
        System.out.println("Top up: " + amount);
    }

    public void topUp(double amount) {
        System.out.println("Top up: " + amount);
    }

    public void pay(double amount) {
        System.out.println("Pay: " + amount);
    }

    public double balance() {
        return 0;
    }

    public void transfer(DigitalMoney recipient, double amount) {
        System.out.println("Transfer: " + amount);
    }

    public void withDraw(double amount) {
        System.out.println("Withdraw: " + amount);
    }

    public void debit(double amount) {
        System.out.println("Debit: " + amount);
    }

    public void credit(double amount) {
        System.out.println("Credit: " + amount);
    }
    
}
