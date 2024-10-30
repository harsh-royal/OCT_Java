import java.util.Scanner;

public class Cordinet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter The X Cordinate");
        int x  = sc.nextInt();
        System.err.println("Enter The y Cordinate");
        int y  = sc.nextInt();

        if (x > 0  & y >0) {
            System.out.println("The coordinate point ("+x+","+y+ ") lies in the First quadrant.");
        }
    }
}


        