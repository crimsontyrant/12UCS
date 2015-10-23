import hsa.*;
public class Library {
    public static void main(String[] args) {
        Console c;
        c =new Console(35,80);
        Book b[] = new Book[5];
        b[0] = new Book("From Russia With Love","Greg Hines");
        b[1] = new Book("Living Smart","Rita Langill");
        b[2] = new Book("Singing in the Rain","Harry Conner");
        b[3] = new Book("Good Housekeeping","Pat Burns");
        b[4] = new Book("To Be A Model","Lisa Lahey");
        c.println("Available books:\n");
        for (int i = 0; i < 5; i++) {
            c.println("Book 1: " + b[i]);
        }
        Patron p=new Patron("Kick Neenan");
        c.println("Lending 4 books to "+p.getName());
        for (int i = 0; i < 4; i++) {
            if (p.borrow(b[i])){
                c.println(b[i].getTitle() +" successfully borrowed.");
            }
            else{
                c.println(b[i].getTitle() +" could not be borrowed.");
            }
        }
        //return books
        c.println("-------\nAtempting to return the first book:\n--------------");
        if (p.returnBook(b[0])) c.println(""+b[0].getTitle()+" successfully returned.");
        else    c.println(""+b[0].getTitle()+" was not borrowed");
        c.println("-------\nHere are a list of books currently lent to "+ p.getName()+".\n----");
        for (int i = 0; i < 5; i++){
            if(p.hasBook(b[i])) c.println(""+b[i]);
        }
    }
    
}