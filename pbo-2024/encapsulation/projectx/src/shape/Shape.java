package shape;
public abstract class Shape {
    protected double area;

    abstract double area();
    abstract double perimeter();

    void print() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

