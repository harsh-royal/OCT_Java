import java.util.Scanner;

public class Finepow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Base");
        int ba = sc.nextInt();

        System.out.print("Enter Exponent");
        int e = sc.nextInt();
        int n=1;
        for(int i=1; i<=e ;i++){
              n = n * ba; 
        }
        System.out.println("Power is " + n);
        sc.close();
    }
}
