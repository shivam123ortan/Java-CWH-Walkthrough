/**
 * Q2
 */
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Marks 1st: ");
        float a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Marks 2nd: ");
        float b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Marks 3rd: ");
        float c = sc3.nextInt();

        float d = (((a + b + c)/30));
        System.out.println(d);
    }
}