import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Cost Price");
        int cost_price = sc.nextInt();

        System.out.print("Enter Sell Price");
        int sell_price = sc.nextInt();
        

        if (sell_price>cost_price) {
            System.out.println("Profit");
        }
        else System.out.println("Loss");
        sc.close();
    }
}
