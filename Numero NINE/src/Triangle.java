import TurtleGraphics.Pen;

public class Triangle extends AbstractShape{
    double y2,y3,x2,x3;
    public Triangle(){
        super(0,0);
        y2=50;
        y3=70;
        x2=50;
        x3=80;
    }
    
    public Triangle(double x, double y, double xa, double ya, double xb, double yb){
        super(x,y);
        x2= xa;
        y2=ya;
        x3=xb;
        y3=yb;
            
    }
    
    public double area() {
        return Math.abs((xPos*y2-x2*yPos)+(x2*y3-x3*y2)+(x3*yPos-xPos*y3))/2;
    }

    public double perimeter() {
        return Math.sqrt((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2))+Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2))+Math.sqrt((xPos-x3)*(xPos-x3)+(yPos-y3)*(yPos-y3));
    }

    
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(x2, y2);
        p.move(x3, y3);
        p.move(xPos, yPos);
    }
    
    public void move(double x, double y) {
        double diffx=x-xPos;
        double diffy=y-yPos;
        xPos=x;
        yPos=y;
        x2+=diffx;
        y2+=diffy;
        x3+=diffx;
        y3+=diffy;
        
    }
    
    public void stretchBy(double factor) {
        x2= (x2-xPos)* factor + xPos;
        y2= (y2-yPos)* factor + yPos;
        x3= (x3-xPos)* factor + xPos;
        y3= (y3-yPos)* factor + yPos;
    }
    
    public String toString(){
        String str= "Triangle\n";
        str+="X-Y: ("+xPos+", "+yPos+")"+"\n";
        str+="X2-Y2: ("+x2+", "+y2+")"+"\n";
        str+="X3-Y3: ("+x3+", "+y3+")"+"\n";
        str+="Area: "+ area() +"\n";
        str+="Permeter: "+ perimeter() +"\n";
        return str;
    }
    
}
