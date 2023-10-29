public class StringClass {
    public static void main(String[] args) {
        String abu = "My name is Abu";
        System.out.println(abu.substring(0,5));
        System.out.println(abu.substring(5));
        System.out.println(abu.length());
        int sum = 0;
        while(abu != "\0"){
            sum = sum+1;
        }
        System.out.println(sum);
    }
}
