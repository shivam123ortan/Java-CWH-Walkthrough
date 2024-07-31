import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");       
        double a = sc.nextLong();
        
        System.out.println("In Miles:");
        double b = a*0.621;
        System.out.println(b);
    }
    
}
