import java.util.Scanner;

public class Posstive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enete Number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " Positive");
        } else {
            System.out.println(num + " is Negetive");
        }
        sc.close();
    }
}
