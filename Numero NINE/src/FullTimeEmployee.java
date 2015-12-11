
public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(){
        super("",0,0);
               
    }
    
    public FullTimeEmployee(String n, double r, double h){
        super(n,r,h);
    }
    
    public double getPay() {
        if (hours<=40){
            tot+=rate*hours;
            return rate*hours;
        }
        else{
            tot+=(rate*40)+(hours-40)*rate*2;
            return (rate*40)+(hours-40)*rate*2;
        }    
    }
    
}
