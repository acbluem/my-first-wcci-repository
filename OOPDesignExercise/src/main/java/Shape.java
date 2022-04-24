import org.w3c.dom.ls.LSOutput;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "Green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract void getArea();
    abstract void getPerimeter();

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public String toString() {
        String filledStatus = "filled";
        if(!filled) {
            filledStatus = "not filled";
        }
        return "A Shape with color of " + color + " and " + filledStatus;
    }
}
