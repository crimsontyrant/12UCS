
public class Student {

    //first step - define properties of student
    private String name;
    private int mark1, mark2, mark3;

    //second step - constructor method
    public Student() {
        this("Unknown",0,0,0);
    }
    public Student(String n, int a, int b, int c) {
        name = n;
        mark1 = a;
        mark2 = b;
        mark3 = c;
    }
    public Student(Student other) {
        this(other.name, other.mark1, other.mark2, other.mark3);
    }
    //define abilities
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setMark(int which, int score){
        if(which==1)mark1=score;
        else if(which==2)mark2=score;
        else mark3=score;
    }
    public int getMark(int which){
        if(which==1)return mark1;
        else if(which==2)return mark2;
        else return mark3;
    }
    public int getAverage(){
        return (mark1 + mark2 + mark3)/3;
    }
    public int getHighScore() {
        if (mark1 >= mark2 & mark1 >= mark3) {
            return mark1;
        } else if (mark2 >= mark1 & mark2 >= mark3) {
            return mark2;
        } else {
            return mark3;
        }
    }
    public String toString(){
        String str="Name:\t" + name;
        str+="\nMark1:\t" + mark1;
        str+="\nMark2:\t" + mark2;
        str+="\nMark3:\t" + mark3;
        str+="\nAverage:\t" + getAverage();
        return str;
    }
}
