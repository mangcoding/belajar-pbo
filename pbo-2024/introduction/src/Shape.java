import java.util.Scanner;
public class Shape {
    private Double Area;
    private Double Perimeter;
    private Double width;
    protected Double height;
    private Double length;

    public void setWidth(Double width) {
        this.width = width;
    }

    public void calculateArea() {
        Area = width * height;
    }

    public void calculatePerimeter() {
        Perimeter = 2 * (width + height);
    }
}