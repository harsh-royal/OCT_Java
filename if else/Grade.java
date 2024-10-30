import java.util.Scanner;

public class Grade {
    Scanner sc = new Scanner(System.in);
    
    char gr = sc.next().charAt(0);

    if((gr == 'e') && (gr =='E')){
        System.out.print("Exelent");
    }
    else if((gr == 'v') && (gr =='V')){
        System.out.print("Very good");
    }
    else if((gr == 'g') && (gr =='G')){
        System.out.print("Good");
    }
    else if((gr == 'a') && (gr =='A')){
        System.out.print("A Grade");
    }
    else if((gr == 'f') && (gr =='F')){
        System.out.print("Fail");
    }
    else {
    System.out.println("Invalid Input");
    }
    sc.close();

}
