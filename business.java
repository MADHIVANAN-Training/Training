package fibo;
import java.util.Scanner;
 
public class business {
 
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number Fibonacci series: ");
        
        int number =sc.nextInt();
 
        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
    
        for(int i=1; i<=number; i++){
            System.out.println(businessRecusion(i) +" ");
        }
    }
    public static int businessRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return businessRecusion(number-1) + businessRecusion(number -2);
    }
}
