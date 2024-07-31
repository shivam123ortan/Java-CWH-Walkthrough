
import java.util.Random;
import java.util.Scanner;

/**
 * RPS
 */
public class RPS {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(3)+1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for your Selection:---");
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissor");
        int a = sc.nextInt();

        if ((num==2) && (a==3)){
            System.out.println("Computer Selected: ");
            System.out.println(num);
            System.out.println("You won");
        }
        else if ((num==3) && (a==1)){
            System.out.println("Computer Selected: ");
            System.out.println(num);
            System.out.println("You won");
        }        
        else if ((num==1) && (a==2)){
            System.out.println("Computer Selected: ");
            System.out.println(num);
            System.out.println("You won");
        }
        else if (num==a) {
            System.out.println("Computer Selected: ");
            System.out.println("Match Drawn");
        }
        else {
            System.out.println("You loose");
            System.out.println("Coputer selected: ");
            System.out.println(num);
        }
    }
}