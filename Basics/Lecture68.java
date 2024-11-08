 // Check if a number is prime or not 
import java.util.*;
public class Lecture68{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("Prime");
        }
        else{
            boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){ // you can use i<=Math.sqrt(n); which is root n
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        }

        sc.close();
    }
}


        