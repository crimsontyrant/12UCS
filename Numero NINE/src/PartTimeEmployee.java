
public class PartTimeEmployee extends Employee {

   public PartTimeEmployee(){
        super("",0,0);
               
    }
    
    public PartTimeEmployee(String n, double r, double h){
        super(n,r,h);
    }
           
    public double getPay() {
        tot+= hours*rate;
        return hours*rate;
    }
    
}
