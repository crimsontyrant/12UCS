
import java.util.ArrayList;


public class ArrayListPeople {

    
    public static void main(String[] args) {
        ArrayList<People> list= new ArrayList();
        //add 5 people to list
        for(int x=1; x<=5; x++){
            int age= (int)((Math.random()*70)+1);
            list.add(new People("Person "+ x, age));
        }
        for (int x=0; x<list.size();x++){
            System.out.println(list.get(x));
        }
        System.out.println("Inserting Joe at the top");
        list.add(0, new People("Joe",44));
        System.out.println("Inserting Bob at location 3");
        list.add(3, new People("Bob",22));
        System.out.println("Removing Person 4");
        list.remove(5);
        
        for (int x=0; x<list.size();x++){
            System.out.println(list.get(x));
        }
    }
    
}
