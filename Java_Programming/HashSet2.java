import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(1);
        number.add(3);
        number.add(5);
        number.add(6);
        number.add(9);

        for(int i=1;i<10;i++){
            if(number.contains(i)){
                System.out.println(i+" is available in the set");
            }else{
               System.out.println(i+" is not available in the set"); 
            }
        }

    }
}
