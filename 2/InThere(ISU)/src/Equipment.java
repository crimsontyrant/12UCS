public class Equipment extends Item{
    protected String name;
    
    protected boolean equipped = false;
    
    public Equipment(){
        //call abstract constructor
        super("null");
    }
    
    public Equipment(String n){
        super(n);
    }
    
    @Override
    public void useItem() {
        equipped = equipped != true;
        //Equips if unequipped, and vica versa
    }
    
    public boolean isEquipped() {
        return equipped;
    }
    
    @Override
    public String toString(){
        String str= "Is equipped: " + equipped;
        return str;
    }
    
}
