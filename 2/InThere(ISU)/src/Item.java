public abstract class Item{
    protected String name;
    
    public Item(){
        name=null;
    }
    
    public Item(String n){
        name=n;
    }
    
    public abstract void useItem(); 

    public final String getName() {
        return name;
    }

    public void setName(String n) {
        name=n;
    }
    
    @Override
    public String toString(){
        return "Name: " + name +"\n";
    }
}
