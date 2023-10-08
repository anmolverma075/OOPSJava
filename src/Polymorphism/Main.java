package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        Shapes square = new Square();
        square.area(); // it will show the one which is in the object.

        shape.area();
        circle.area();
    }
}
