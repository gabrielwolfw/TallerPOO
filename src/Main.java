public class Main {
    public static void main(String[] args) {

        //Console program
        FiguraGeometrica[] figuras = new FiguraGeometrica[5];



        //Trapezoid information
        int base1 = 3;
        int base2 = 10;
        int height = 5;
        int resultSide = (int) (Math.sqrt(Math.pow(base2 - base1 + height, 2) + 4 * Math.pow(height, 2)) / 2);




        figuras[0] = new Circle(5, "Circulo");
        figuras[1] = new Square(6, "Cuadrado");
        figuras[2] = new Rectangle(5,10,"Rectangulo");
        figuras[3] = new RegularTrapezoid(base1,base2,height,resultSide,"Trapezoide");
        figuras[4] = new Parallelogram(20,12,13,"Paralelogramo ");

        for(int i = 0; i < figuras.length; i++){
            System.out.println("\n");
            System.out.println("Figura: " + figuras[i].name);
            System.out.println("Area: " + figuras[i].getArea());
            System.out.println("Perimetro: " + figuras[i].getPerimeter());

        }


        //Testing




    }
}