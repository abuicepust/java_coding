import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Farrari");
        cars.add("Tesla");
        cars.add("Void");
        cars.add("Poor");

        System.out.println(cars);

        System.out.println(cars.get(1));
    }
}
