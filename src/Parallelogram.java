public class Parallelogram extends FiguraGeometrica{
    int base;
    int side;
    int height;


    //Class Constructor
    public Parallelogram(int base_,int side_,int height_, String name_){
        super(name_);
        this.base = base_;
        this.side = side_;
        this.height = height_;
    }

    @Override
    public float getPerimeter() {
        return 2 * (base + side);
    }

    @Override
    public float getArea() {
        return base * height;
    }
}
