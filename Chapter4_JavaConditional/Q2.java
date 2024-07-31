import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Physics");
        float a = sc.nextFloat();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the marks in Chemistry");
        float b = sc1.nextFloat();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the marks in Maths");
        float c = sc2.nextFloat();

        float d = a + b + c;
        float e = d/300 * 100;

        if (a<33){
            System.out.println("You are FAIL!!!");
        }
        else if (b<33){
            System.out.println("You are FAIL!!!");
        }
        else if (c<33){
            System.out.println("You are FAIL!!!");
        }
        else if (e<40){
            System.out.println("You are FAIL!!!");
        }
        else {
            System.out.println("Congratulations you are PASS!!!");
        }

    }
    
}
