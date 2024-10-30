import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.print("Enter Any Char :-");
        int choice = sc.nextInt();

        switch (choice) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
          
                System.out.println("Vowel");
         
                
                break;
        
            default:
            System.out.println("Consonent");

                break;
           
        }
        sc.close();
    }
}
