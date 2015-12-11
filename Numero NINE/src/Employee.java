
public abstract class Employee {
    protected double rate, hours;
    protected String name;
    protected static double tot=0;
    
    public Employee(){
       this("",0,0);
    }
    public Employee(String a, double b, double c){
        name=a;
        rate=b;
        hours=c;
    }
    
    
     public boolean setRate(double r){
        boolean rateok= (r>=6.25 && r<=30.50);
        if(rateok){
            rate=r;
            return true;
        }
        else return false;
     }
     
    public boolean setHours(double h){
        boolean hoursok= (h>=1 && h<=60);
        if(hoursok){
            hours=h;
            return true;
        }
        else return false;
     }
    
    public boolean setName(String n){
        if(n.length()>0){
            name=n;return true;
        }
        else return false;
    }
    //4 methods that return the rules to follow
    public static String getNameRules(){
        return "Name must not be blank";
    }
    
    public static String getHourRules(){
        return "Hours must be from 1 to 60";
    }
    
    public static String getRateRules(){
        return "Rate must be from 6.25 to 30.50";
    }
    
    public String getName(){
        return name;
    }
    
    public abstract double getPay();
    
    public static double getTotalPay(){
        return tot;
    }
}
    
    
    
    
    

