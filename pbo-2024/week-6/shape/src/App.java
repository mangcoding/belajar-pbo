import digitalmoney.NusaputraPay;

public class App {
    public static void main(String[] args) throws Exception {
        NusaputraPay NusaPay = new NusaputraPay();
        NusaPay.topUp(100000.0);
    }
}
