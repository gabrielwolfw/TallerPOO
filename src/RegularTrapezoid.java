public class RegularTrapezoid extends FiguraGeometrica{
    int base1;
    int base2;
    int height;
    int side;

    //Class Constructor
    public RegularTrapezoid(int  base1_, int base2_, int height_, int side_, String name_){
        super(name_);
        this.base1 = base1_;
        this.base2 = base2_;
        this.height = height_;
        this.side = side_;
    }

    @Override
    public float getPerimeter() {
        return 2 * side +base1 + base2;
    }

    @Override
    public float getArea() {
        return (base1 + base2) * height / 2;
    }
}
