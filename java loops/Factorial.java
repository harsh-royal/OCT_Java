import java.util.Scanner;

public class Factorial {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int f=1;
    System.out.print("Enter The Number");
    int n = sc.nextInt();
    for(int i=1; i<=n ;i++){
        f= f*i;
    }
    System.out.print("Factorial Of " + n+" is "+f);
    sc.close();
 }   
}
