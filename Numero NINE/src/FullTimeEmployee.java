
public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(){
        super();
        
    }
    
    public FullTimeEmployee(String n, double r, double h){
        
    }
    
    public double getPay() {
        if (hours<=40) return rate*hours;
            else
                return (rate*40)+(hours-40)*rate*2;
    }
    
}
