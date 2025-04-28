package Java_OOP_Concepts.Q4Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(),
                new Square(),
                new Triangle()
        };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
