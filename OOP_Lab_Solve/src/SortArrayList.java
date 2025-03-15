import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(5);

        System.out.println("Before sorting: ");
        for(int i : al) {
            System.out.println(i);
        }

        Collections.sort(al, Collections.reverseOrder());

        System.out.println("After sorting: ");

        for(int i : al) {
            System.out.println(i);
        }
    }
}
