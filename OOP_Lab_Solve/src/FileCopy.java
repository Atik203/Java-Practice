import java.io.*;
import java.util.List;

public class FileCopy {

  public static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');


    public static void main(String[] args) throws IOException {

        FileInputStream r = new FileInputStream("src/a.txt");
        FileOutputStream w = new FileOutputStream("src/b.txt");

        int i;

        while ((i = r.read()) != -1) {
            //  copy only vowels
            if ( VOWELS.contains((char) i) ) {
                w.write(i);
            }
            //  copy only digits
            if( (char) i >= '0' && (char) i <= '9' ) {
                w.write(i);
            }
        }
        r.close();


    }

}
