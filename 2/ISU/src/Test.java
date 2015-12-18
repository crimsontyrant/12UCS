import TerminalIO.KeyboardReader;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        NameGenerator n = new NameGenerator();
        for (int i = 0; i < 30; i++) {
            System.out.println(n.toString());
        }
    }
    
}
