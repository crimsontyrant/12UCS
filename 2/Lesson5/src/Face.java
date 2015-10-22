import java.awt.Color;
import processing.core.PApplet;

public class Face {
    private PApplet pen;
    private float xLoc, yLoc, diameter;
    private boolean smile;
    private Color color;
    
    public Face(PApplet p, float x, float y){
        xLoc= x;
        yLoc= y;
        diameter = 100;
        color = Color.YELLOW;
        pen=p;
        smile=true;
    }
    
    public void draw(){
        pen.stroke(0);//black outline
        pen.fill(color.getRed(),color.getGreen(),color.getBlue());
        drawCircle(xLoc, yLoc, diameter, diameter);
        pen.fill(255,0,0);
        drawCircle(xLoc-diameter/5, yLoc-diameter/5, diameter/4, diameter/4);
        drawCircle(xLoc+diameter/5, yLoc-diameter/5, diameter/4, diameter/4);
        //mouth
        if (smile){
            drawLine(xLoc-.2*diameter, yLoc+.3*diameter, xLoc+.20*diameter, yLoc+.3*diameter);
            drawLine(xLoc-.2*diameter, yLoc+.3*diameter, xLoc-.25*diameter, yLoc+.2*diameter);
            drawLine(xLoc+.2*diameter, yLoc+.3*diameter, xLoc+.25*diameter, yLoc+.2*diameter);
        }
        else if(smile==false){
            drawLine(xLoc-.2*diameter, yLoc+.3*diameter, xLoc+.20*diameter, yLoc+.3*diameter);
            drawLine(xLoc-.2*diameter, yLoc+.3*diameter, xLoc-.25*diameter, yLoc+.4*diameter);
            drawLine(xLoc+.2*diameter, yLoc+.3*diameter, xLoc+.25*diameter, yLoc+.4*diameter);
        }
    }
    
    
    public void setDiameter(float r){
        diameter=r;
    }
    
    public void move(float x, float y){
        xLoc=x;
        yLoc=y;
    }
    
    public void setMood(int m){
        if  (m==1){
            smile=true;
        }
        else if (m==0){
            smile=false;
        }
    }
    
    public void setColor(Color c){
        color=c;
    }

    private void drawCircle(float x, float y, float w, float h){
        pen.ellipse(x, y, w, h);
    }
    
    private void drawLine(double x1, double y1, double x2, double y2){
        pen.line((float)x1, (float)y1 , (float)x2, (float)y2);
    }
     
    public void erase(){
        pen.fill(255);
        pen.noStroke();
        pen.ellipse(xLoc, yLoc, diameter+5, diameter+5);
    } 
}