import java.util.Scanner;
import java.lang.Math;
class Sphere{
    private int radius;
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public double getVolume(){
        return (4/3)*3.14*Math.pow(radius,3);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius: ");
        int rad = sc.nextInt();
        Sphere s = new Sphere();
        s.setRadius(rad);
        System.out.println(s.getRadius());
        System.out.println(s.getVolume());




    }
    
}
