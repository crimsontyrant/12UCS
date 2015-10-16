
public class MakeStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student x = new Student();
        x.setName("Khaled El Amad");
        x.setMark(1, 75);
        x.setMark(2, 0);
        x.setMark(3, 0);
        System.out.println("The student is: " + x.getName());
        System.out.println("The average is: " + x.getAverage());
        System.out.println("Here are all the details:");
        System.out.println(x);
    }
    
}
