import TurtleGraphics.*;

public class Wheel extends Circle {
    //plus three properties from circle
    private int spokes;
    
    public Wheel(){
        super();
        spokes=0;
    }
    
    public Wheel(double x, double y, double r, int s){
        super(x,y,r);
        spokes=s;
    }
    
    public void draw(Pen p){
        super.draw(p);//calls circle .draw
        //draw spokes
        for(int x=1; x<=spokes; x++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(x * 360/spokes);
            p.down();
            p.move(radius);
        }
    }
    
    public String toString(){
        String str= "WHEEL\n";
        str+="Radius = "+radius+"\n";
        str+="X-Y: ("+xPos+", "+yPos+")" +"\n";
        str+="Area: "+ area() +"\n";
        str+="Spokes: "+spokes+"\n";
        str+="Permeter: "+ perimeter() +"\n";
        return str;
    }
    //only available to wheel not circle
    public void setSpokes(int s){
        spokes=s;
    }
    
}
