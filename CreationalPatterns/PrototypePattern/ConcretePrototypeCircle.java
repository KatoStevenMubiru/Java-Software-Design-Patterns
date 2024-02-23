package PrototypePattern;

public class ConcretePrototypeCircle implements Prototype{
    private int radius;

    public ConcretePrototypeCircle(int radius){
        this.radius = radius ;
    }
    public ConcretePrototypeCircle(ConcretePrototypeCircle circle) {
              this.radius = circle.radius;
    }
    @Override
    public Prototype clone() {
        return new ConcretePrototypeCircle(this);
    }  
    // Additional methods specific to Circle
    public void setRadius(int radius) {
            this.radius = radius;
        }
    
        public int getRadius() {
            return radius;
        } 
}