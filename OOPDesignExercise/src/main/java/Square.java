import java.util.stream.Stream;

public class Square extends Rectangle{
    public Square(int top, int left, int bottom, int right){
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }

    public boolean isSquare() {
        return Stream.of(this.top, this.left, this.bottom, this.right).distinct().count() == 1;
    }

    @Override
    public String toString() {
        return "A Square with side " + this.top + ", which is a subclass of " + Rectangle.toString();
    }
}
