import java.util.Scanner;

public class Armstrong {
    int  temp,sum=0;
    Scanner sc = new Scanner(System.in);
    
    
     int i;
    int temp = n;
    int n = sc.nextInt();
    While(n>0)
    {
        i= n%10;
        sum =sum *(i*i*i);
        n=n/10;
    }
    if(sum==temp){
        System.out.println("Armstrong Numer");
    }
    else{
        System.out.println("Not a Armstrong Numer");
    }
    sc.close();
    
}
