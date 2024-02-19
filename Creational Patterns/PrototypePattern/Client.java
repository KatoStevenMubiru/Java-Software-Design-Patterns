package PrototypePattern;

public class Client {
    public static void main(String[] args) {
        // Create prototypes
        ConcretePrototypeCircle circlePrototype = new ConcretePrototypeCircle(5);
        ConcretePrototypeRectangle rectanglePrototype = new ConcretePrototypeRectangle(10, 20);

        // Clone prototypes
        ConcretePrototypeCircle clonedCircle = (ConcretePrototypeCircle) circlePrototype.clone();
        ConcretePrototypeRectangle clonedRectangle = (ConcretePrototypeRectangle) rectanglePrototype.clone();

        // Use the cloned instances
        System.out.println("Original Circle Radius: " + circlePrototype.getRadius());
        System.out.println("Cloned Circle Radius: " + clonedCircle.getRadius());

        System.out.println("Original Rectangle Width: " + rectanglePrototype.getWidth());
        System.out.println("Cloned Rectangle Width: " + clonedRectangle.getWidth());
    }
}