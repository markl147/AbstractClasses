public class Main extends Shape {

    public static void main(String[] args) {
        Shape someShape = new Square();
        someShape.draw();

        Shape b = new Rectangle();
        b.draw();

        Shape c = new Triangle();
        c.draw();
    }
}
