//This is an Abstract Decorator Class

public abstract class ShapeDecorator implements Shape{
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
    this.decoratedShape = decoratedShape;
   }

   public void draw(){
    decoratedShape.draw();
   }
}