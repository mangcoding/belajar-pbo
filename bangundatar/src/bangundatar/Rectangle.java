package bangundatar;

class Rectangle implements Shape {
    private double length;
    private double width;
    protected double area;
    protected double perimeter;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calcArea() {
        this.area = this.length * this.width;
    }

    @Override
    public void calcPerimeter() {
        this.perimeter = 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }

    public String toString() {
        return "Rectangle (" + this.length + "," + this.width+")"+ "area: " + this.area + " perimeter: " + this.perimeter;
    }
}
