public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity = " + str2.capacity());
        StringBuilder str3 = new StringBuilder(str1.toString());

        // print string
        System.out.println("String3 = " + str3.toString());
    }
}
