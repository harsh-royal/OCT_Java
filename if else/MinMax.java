import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of  a ");
        int a = sc.nextInt();
        System.out.print("Enter Value of  b ");
        int b = sc.nextInt();
        System.out.print("Enter Value of  c ");
        int c = sc.nextInt();

        if (a>b && a> c) {
            System.out.println(+a +" is bigger");
        }
        else if(b>c){
            System.out.println( b +" Is Bigger");
        }
        else     System.out.println( c +" Is Bigger");
        sc.close();
    }
}
