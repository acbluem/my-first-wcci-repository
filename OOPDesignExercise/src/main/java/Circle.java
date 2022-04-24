public class Circle {
    private double radius;
    private boolean corners;

    public Circle(double radius, boolean corners) {
        this.radius = radius;
        this.corners = corners;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public boolean isCircle() {
        return !corners;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + Shape.toString();
    }
}
