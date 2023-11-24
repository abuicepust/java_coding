import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> HS = new HashSet<>();

        HS.add("BMW");
        HS.add("Farrari");
        HS.add("Tesla");
        HS.add("You poor");

        System.out.println(HS);

        System.out.println(HS.contains("Hundai"));
    }
}
