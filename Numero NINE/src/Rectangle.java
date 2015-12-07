
import TurtleGraphics.Pen;


public class Rectangle extends AbstractShape{

    private double width, height;
    
    public Rectangle(){
        super(0,0);
        width=1;
        height=1;
    }
    
    public Rectangle(double x, double y, double w, double h){
        super(x,y);
        width=w;
        height=h;
    }
    
    public double area() {
        return width*height;
    }
    
    public double perimeter(){
        return (width*2)+(height*2);
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
        
    }
      
    public void stretchBy(double factor) {
        width*=factor;
        height*=factor;
    }
    
    public String toString(){
        String str= "RECTANGLE\n";
        str+="Width x Height = "+width+" x "+ height+"\n";
        str+=super.toString();
        str+="Area: "+ area() +"\n";
        str+="Permeter: "+ perimeter() +"\n";
        return str;
    }
}
