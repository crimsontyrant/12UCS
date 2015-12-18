
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NameGenerator {

    private String con[] = new String[21];
    private String vow[] = new String[6];
    private String title[] = new String[5];
    private String name;
    FileReader f;
    BufferedReader br;
    StringTokenizer st;

    public NameGenerator() {
        readTxt();
    }

    public void readTxt() {
        String data = "";
        try {
            f = new FileReader("./src/syllables.nam");
            br = new BufferedReader(f);

            for (int i = 0; i < 32; i++) {
                data += br.readLine();
            }
            br.close();
            st = new StringTokenizer(data, ",");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        for (int i = 0; i < con.length; i++) {
            con[i] = st.nextToken();

        }
        for (int i = 0; i < vow.length; i++) {
            vow[i] = st.nextToken();
        }
        for (int i = 0; i < title.length; i++) {
            title[i] = st.nextToken();
        }
    }

    public String toString() {
        int nmtype = (int) (Math.random() * 5);
        System.out.println(nmtype);
        if (nmtype == 0) { //CVCV
            name = (con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + " the " + title[(int) (Math.random() * 5)]);
        }
        if (nmtype == 1) { //CVVCV
            name = (con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + vow[(int) (Math.random() * 6)] + con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + " the " + title[(int) (Math.random() * 5)]);
        }
        if (nmtype == 2) { //CVVCVV
            name = (con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + vow[(int) (Math.random() * 6)] + con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + vow[(int) (Math.random() * 6)] + " the " + title[(int) (Math.random() * 5)]);
        }
        if (nmtype == 3) { //CVCVV
            name = (con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + vow[(int) (Math.random() * 6)] + " the " + title[(int) (Math.random() * 5)]);
        }
        if (nmtype == 4) { //CV
            name = (con[(int) (Math.random() * 21)] + vow[(int) (Math.random() * 6)] + " the " + title[(int) (Math.random() * 5)]);
        }
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
}
