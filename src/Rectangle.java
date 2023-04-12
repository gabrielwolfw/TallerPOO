public class Rectangle extends FiguraGeometrica{
    int width;
    int large;

    //Class Constructor
    public Rectangle(int width_, int large_, String name_){
        super(name_);
        this.width = width_;
        this.large = large_;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width * large);
    }

    @Override
    public float getArea() {
        return width * large;
    }
}
