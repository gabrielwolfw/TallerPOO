public class Square extends FiguraGeometrica{
    int side;

    //Class Constructor
    public Square(int side_, String name_){
        super(name_);
        this.side = side_;
    }


    @Override
    public float getPerimeter() {
        return 4 * side;
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
