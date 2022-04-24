public class Rectangle {
    protected int top;
    protected int left;
    protected int bottom;
    protected int right;

    public Rectangle(){};

    public Rectangle(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }

    public int getTopLength() {
        return this.top;
    }

    public int getLeftSide() {
        return this.left;
    }

    public int getBottomLength() {
        return this.bottom;
    }

    public int getRightSide() {
        return this.right;
    }

    public int getArea() {
        return this.top * this.left;
    }

    public int getPerimeter() {
        return (this.top * 2) + (this.left * 2);
    }

    public double getDiagonal() {
        return Math.sqrt((this.top * this.bottom) + (this.left * this.right));
    }

    public boolean isRectangle() {
        return this.top == this.bottom && this.left == this.right;
    }

    @Override
    public String toString() {
        return "A rectangle with width " + this.top + " and length " + this.left + ", which is a subclass of " + Shape.toString();
    }
}
