package bangundatar;

public class IsoscelesTriangle extends Triangle {
    IsoscelesTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    public void calcArea() {
        super.area = 0.5 * super.base * super.height;
    }
}
