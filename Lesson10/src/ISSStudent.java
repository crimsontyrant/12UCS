
public class ISSStudent implements Comparable{
    private int id;
    private String name, address;

    public ISSStudent(String n, String a, int i){
        name=n;
        address=a;
        id=i;
    }
    
    public int getId(){
        return id;
    }
    
    public String toString(){
        String str= "Name:\t"+name;
        str+= "\nAddress:\t"+address;
        str+="\nStudent ID:\t"+id+"\n-------------\n";
        return str;
    }
    
    public int compareTo(Object o) {
        int i= ((ISSStudent)o).getId();
        return (id-i);
        /*
        if(id>i)return 1;
        else if (id<i)return -1;
        else return 0;
        */        
    }
    
}