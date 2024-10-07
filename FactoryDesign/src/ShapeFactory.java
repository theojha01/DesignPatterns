public class ShapeFactory {
    public Shape getShapeInstance(String val){
        if(val.equals("Ci")){
            return new Circle();
        } else if (val.equals("Sq")) {
            return new Square();
        }
        return null;
    }
}
