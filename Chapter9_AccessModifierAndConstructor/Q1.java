/**
 * Q1
 */
import java.lang.Math;
class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int r){
        this.radius = r;

    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double getvolume(){
        double vol = 3.14*Math.pow(radius,2)*height;
        return vol;
    }
    public double getarea(){
        double ar = (3.14*Math.pow(radius,2));
        return ar;
    }
}

public class Q1 {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(8);
        c.setRadius(5);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println(c.getvolume());
        System.out.println(c.getarea());
    }
}