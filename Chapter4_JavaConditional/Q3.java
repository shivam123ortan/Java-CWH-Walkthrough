import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double a = sc.nextDouble();

        if (a<250000){
            System.out.println("No Income tax.");
        }
        else if (a<500000 && a>250000){
            double b = 0.005*a;
            System.out.print("Your income tax is: ");
            System.out.println(b);
        }
        else if (a<=500000 && a>1000000){
            double b = 0.2*a;
            System.out.print("Your income tax is: ");
            System.out.println(b);
        }
        else {
            double b = 0.3*a;
            System.out.print("Your income tax is: ");
            System.out.println(b);
        }
    }
    
}
