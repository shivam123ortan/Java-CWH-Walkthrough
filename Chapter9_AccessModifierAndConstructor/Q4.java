import java.util.Scanner;
class Rectangle{
    private int length;
    private int breath;

    Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: ");
        length = sc.nextInt();
        System.out.println("Breath: ");
        breath = sc.nextInt();   
    }
    public int para(){
        return 2*(length + breath);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.para());
    }
    
}
