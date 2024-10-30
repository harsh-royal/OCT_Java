import java.util.Scanner;

public class Addmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks Of Maths :-");
        int maths = sc.nextInt();
        
        System.out.print("Enter Marks Of Physics :-");
        int phy = sc.nextInt();

        System.out.print("Enter Marks Of Chemistry :-");
        int chem = sc.nextInt();

        int total = maths + phy + chem ;
        int maths_plus_physics = maths + phy;
        if (maths >=65 && phy >= 55 && chem >= 50  && total>=190  || maths_plus_physics>=140) {
            System.out.println("The Student Is Eligible For Admission");
        }
        else System.out.println("The Student Is not Eligible For Admission");
        sc.close();
    }
}
