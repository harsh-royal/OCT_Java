import java.util.Scanner;
public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height :- ");
        int height = sc.nextInt();

        if (height< 135) {
            System.out.println("The person is Dwarf.");
        }
        else{
            System.out.println("the Person Is Not Dwarf");
        }
        sc.close();

    }
}
