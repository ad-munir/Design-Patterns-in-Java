public class Main {
    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();

        shape = ShapeFactory.getShape("square");
        shape.draw();

        ShapeFactory.getShape("rectangle").draw();
    }
}