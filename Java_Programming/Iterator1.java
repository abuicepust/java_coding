import java.util.ArrayList;

import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> arrl1 = new ArrayList<>();
        arrl1.add("BMW");
        arrl1.add("Tesla");
        arrl1.add("Farrari");

        Iterator<String> it = arrl1.iterator();

        System.out.println(it.next());
    }
}
