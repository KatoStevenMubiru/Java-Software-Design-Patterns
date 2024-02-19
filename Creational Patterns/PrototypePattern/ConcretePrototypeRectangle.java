package PrototypePattern;

public class ConcretePrototypeRectangle implements Prototype {
    private int width;
    private int height;

    public ConcretePrototypeRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Copy constructor for cloning
    public ConcretePrototypeRectangle(ConcretePrototypeRectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeRectangle(this);
    }

    // Additional methods specific to Rectangle
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}