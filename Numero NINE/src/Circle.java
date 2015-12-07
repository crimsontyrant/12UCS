
import TurtleGraphics.Pen;


public class Circle extends AbstractShape{
    
    protected double radius;
    
    public Circle(){
        //call abstract shape constructor
        super(0,0);
        radius=1;
        //or type this(0,0,1);
    }
    
    public Circle(double x, double y, double r){
        super(x,y);
        radius=r;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public void draw(Pen p) {
        double side = (2 * Math.PI * radius)/120;
        p.up();
        p.move(xPos + radius, yPos-side/2);
        p.setDirection(90);
        for(int i=0; i<120; i++){
            p.down();
            p.move(side);
            p.turn(3);
            
        }
    }

    public void stretchBy(double factor) {
        radius*=factor;
    }
    
    public String toString(){
        String str= "CIRCLE\n";
        str+="Radius = "+radius+"\n";
        str+=super.toString();
        str+="Area: "+ area() +"\n";
        str+="Permeter: "+ perimeter() +"\n";
        return str;
    }
    
}
