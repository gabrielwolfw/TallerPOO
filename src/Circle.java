public class Circle extends FiguraGeometrica{
    int radius;

    //Class Constructor
    public Circle(int radius_, String name_){
        super(name_);
        this.radius = radius_;
    }
    @Override
    public float getPerimeter() {
        return (float) (2 * 3.14 *radius);
    }
    @Override
    public float getArea() {
        return (float)(3.14 * Math.pow(radius,2));
    }
}
