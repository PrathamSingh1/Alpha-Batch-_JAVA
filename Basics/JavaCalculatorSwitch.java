import java.util.*;
public class JavaCalculatorSwitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A :");
        int a = sc.nextInt();
        System.out.println("Enter the value of B :");
        int b = sc.nextInt();
        System.out.println("Enter one of these operator : +,-,*,/,%");
        char operator = sc.next().charAt(0);
        switch(operator){
        
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default : System.out.println("Please Enter From One Of The Given Operator ");
        }
        sc.close();
    }
}