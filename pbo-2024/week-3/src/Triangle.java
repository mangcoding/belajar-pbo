public class Triangle extends Shape{
    protected double base;
    protected double height;

    public void calculateArea() {
        super.area = 0.5 * base * height;
    }
}
