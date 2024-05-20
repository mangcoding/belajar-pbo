package digitalmoney;
import shape.Shape;

interface DigitalMoney {
    void topUp(double amount);
    void topUp(double amount, String description);
    void pay(double amount);
    double balance();
    void transfer(DigitalMoney recipient, double amount);
    void withDraw(double amount);
}
