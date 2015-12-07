
import TurtleGraphics.Pen;


public abstract class AbstractShape{
    protected double xPos, yPos;
    
    public AbstractShape(){
        xPos=0;
        yPos=0;
    }
    
    public AbstractShape(double x, double y){
        xPos=x;
        yPos=y;
    }
    
    public abstract double area(); 
    
    public abstract double perimeter();

    public abstract void draw(Pen p);
    //final methods cant be changed by children
    public final double getxPos() {
        return xPos;
    }

    public final double getyPos() {
        
        return yPos;
    }

    public void move(double x, double y) {
        xPos=x;
        yPos=y;
    }
      
    public abstract void stretchBy(double factor);
    
    public String toString(){
        return "X-Y: ("+xPos+", "+yPos+")" +"\n";
    }
}
