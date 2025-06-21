import java.io.*;


public class FileSystem {
    public static void main(String[] args) throws IOException{

        FileInputStream f = new FileInputStream("src/a.txt");
        FileOutputStream w = new FileOutputStream("src/b.txt");

        int i;
        while((i = f.read()) != -1){
            w.write(i);

        }

        // close the both file after copying
        f.close();
        w.close();


    }
}
