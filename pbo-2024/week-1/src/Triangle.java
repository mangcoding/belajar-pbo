public class Triangle {
    /* properties or attributes or fields or instance variables or states */
    private double base;
    private double height;

    /* constructor (special method when create object) */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /* methods or behaviors */
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void calculatePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        double perimeter = base + height + hypotenuse;
        System.out.println("Perimeter of triangle: " + perimeter);
    }

    /* Getter Method */
    public double getArea() {
        return 0.5 * base * height;
    }
}