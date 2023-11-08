interface IT{
    public void getITservices();
}
interface Hardware{
    public void getHservices();
}
class Company implements IT,Hardware{
    public void getITservices(){
        System.out.println("Getting IT services");
    }
    public void getHservices(){
        System.out.println("Getting Hardware services");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        Company obj = new Company();
        obj.getITservices();
        obj.getHservices();
    }
}
