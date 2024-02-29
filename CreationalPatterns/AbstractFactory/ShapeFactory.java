public class ShapeFactory extends AbstractFactory {
    
    @Override
    public Shape getShape(String shapeType){
        if(shapeType,equalsIgnoreCase("Rounded Rectangle")){
            return new RoundedRect();
        }else if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();

        }
        return null;
    }
}
