import java.util.Arrays;

public class SubString2 {
    public static void main(String[] args) {
        String abc = "Hello, I am Abu Yousuf";
        String mof = "MOF";
        System.out.println(abc.length());

        System.out.println(abc.substring(7));
        System.out.println(mof.substring(0));

        String[] split = abc.split("\\.");
        System.out.println(Arrays.toString(split));
    }
}
