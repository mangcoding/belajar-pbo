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
        super.area = 0.5 * this.sideLength * height;
    }

    @Override
    public void calcPerimeter() {
        super.perimeter = 3*this.sideLength;
    }
}
