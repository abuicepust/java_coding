import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Farrari");
        cars.add("Tesla");
        cars.add("Poor no car");


        System.out.println(cars);

        //get element
        System.out.println(cars.get(1));

        //loop thorugh the arraylisy
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        //clearing arraylist
        cars.clear();
        System.out.println(cars);
    }
}
