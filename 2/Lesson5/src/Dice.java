public class Dice {
    private int roll, max, sides;
    public Dice(){
        setSides(6);
    }
    public Dice(int num){
        setSides(num);
    }
    public int getRoll(){
        roll = (int)(Math.random() * sides) + 1;
        return roll;
    }
    public void setSides(int num){
        sides = num;
    }
}
