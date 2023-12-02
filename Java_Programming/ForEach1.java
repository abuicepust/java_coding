public class ForEach1 {
    public static void main(String[] args) {
        System.out.println("How for each loop works");

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int element : arr) {
            System.out.print(element + " ");
        }
        //Equivalent to this piece of code
        // for (int i=0; i<arr.length; i++)
        // {
        // int element = arr[i];
        // statements using var;
        // }
    }
}
