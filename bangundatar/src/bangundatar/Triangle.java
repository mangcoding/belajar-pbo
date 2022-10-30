package bangundatar;

abstract class Triangle implements Shape{
    protected double base;
    protected double height;
    protected double hypotenuse;
    protected double area;
    protected double perimeter;

    public abstract void calcArea();

    /* Segitiga sembarang*/
    Triangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    /* Segitiga sama kaki */
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    /* Segitiga sama sisi */
    Triangle(double base) {
        this.base = base;
        this.height = base;
        this.hypotenuse = base;
    }

    public void calcPerimeter() {
        this.perimeter = this.base + this.height + this.hypotenuse;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
}
