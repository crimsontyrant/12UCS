public class SingleUse extends Item{
    protected String name;
    
    protected boolean used = false;
    //single use items can only be used once
    public SingleUse(){
        //call abstract constructor
        super("null");
    }
    
    public SingleUse(String n){
        super(n);
    }
    
    @Override
    public void useItem() {
        used = true; //uses the item
    }
    
    public boolean isUsed() {
        return used;
    }
    
    @Override
    public String toString(){
        String str= "Is used: " + used;
        return str;
    }
    
}
