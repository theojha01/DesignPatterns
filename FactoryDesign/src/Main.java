public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ShapeFactory shapeFactory=new ShapeFactory();
        Shape s=shapeFactory.getShapeInstance("Ci");
        s.findShape();

    }
}