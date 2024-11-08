// import java.util.*;
// public class Lecture61{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number you want to reverse : ");
//         int n = sc.nextInt();
//         while(n > 0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n/10;
//         }

//     }
// }


// public class Lecture61{
//     public static void main(String args []){
//         int n = 121212;
//         int rev = 0;
//         while(n > 0){
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }

        
            // break statement
import java.util.*;
public class Lecture61{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        
        sc.close();

    }
}