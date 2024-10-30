import java.util.Scanner;


public class Eqal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 1");
        int num2 = sc.nextInt();

        if (num1 == num2 ) {
            System.out.print("Both Are Eqal");   
        }
        else{
            System.out.print("Both Are  Not Eqal");
        }
        sc.close();



    }
}