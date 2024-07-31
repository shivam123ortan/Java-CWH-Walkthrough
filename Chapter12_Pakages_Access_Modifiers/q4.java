

class Shivam{
    int a = 5;
    private int b = 45;
}
class Sumit extends Shivam{
    Sumit(){
        System.out.println(super.a);
        System.out.println(super.b);
    }
}
public class q4 {
    public static void main(String[] args) {
        System.out.println("I am main method.");
        Sumit s = new Sumit();
    }
    
}
