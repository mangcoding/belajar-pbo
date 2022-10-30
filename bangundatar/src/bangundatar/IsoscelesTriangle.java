package bangundatar;

public class IsoscelesTriangle extends Triangle {
    IsoscelesTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    public void calcArea() {
        this.area = 0.5 * this.base * this.height;
    }
}
