import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Inputs :- ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >='A' && ch<='Z')) {

            System.out.print("This Is A Charachter ");   
        }
        else if(ch>=48 && ch <= 57){
            System.out.print("This Is A Digit ");   

        }
        else{
            System.out.print("This Is A Spesial   Charachter ");   
        }
        sc.close();

    }
}