public class LibMath<T extends Number,U extends Number> {
    private T angka1;
    private U angka2;

    public LibMath(T angka1, U angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public void add() {
        System.out.println(angka1.intValue() + (Integer) angka2.intValue());
    }
}


