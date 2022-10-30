package bangundatar;
/* Segitga sama sisi */
public class EqualTriangle extends Triangle {
    private double sideLength;

    EqualTriangle(double a) {
        super(a);
        this.sideLength = a;
    }

    @Override
    public void calcArea() {
        double height = Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength/2, 2));
        this.area = 0.5 * this.base * height;
    }

    @Override
    public void calcPerimeter() {
        this.perimeter = 3*this.sideLength;
    }
}
