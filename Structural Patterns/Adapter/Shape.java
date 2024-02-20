// This is the 'Target' interface, which clients use.
interface Shape{
    void draw(int x1, int y1, int x2, int y2);
}
// This is the 'Adaptee' class, which has a different interface.
class Line{
    public void drawline(nt x1, int y1, int x2, int y2){
        System.out.println("Line from point A(" + x1 + "," + y1 + "), to point B(" + x2 + "," + y2 + ")");
    }
}
// This is the 'Adapter' class, which translates the interface of Line to Shape.
class LineAdapter extends Line implements Shape{
    @Override
    public void draw(int x1, int y1, int x2, int y2){
        drawLine(x1, y1, x2, y2);
    }
}
// Client code that uses the 'Target' interface.
public class AdapterDemo{
    public static void main(String[] args){
        Line line = new Line();
        Shape lineAdapter = new LineAdapter(line);
        
    }
}