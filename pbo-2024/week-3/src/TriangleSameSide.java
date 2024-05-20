public class TriangleSameSide extends Triangle{
    private double side;

    public TriangleSameSide(double side) {
        this.side = side;
        this.base = side;
    }

    public void calculateHeight() {
        super.height = Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
    }
}
