package bangundatar;

public class Square extends Rectangle {
    private double sideLength;
    Square(double sideLength) {
        super(sideLength,sideLength);
    };

    double getLength() {
        return this.sideLength;
    }

    public String toString() {
        return "Square with "+this.sideLength+"\narea: " + this.area + "\nperimeter: " + this.perimeter;
    }
}
