// import java.util.*;
// public class JavaPractice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >= 18){
//             System.out.println("You are an adult");
//         }
//         else if(age >= 13 && age < 18){
//             System.out.println("You are now a teenager");
//         }
//         else{
//             System.out.println("Child go and watch pogo");
//         }
//     }
// }


//    Check if a student will pass of fail
// import java.util.*;
// public class JavaPractice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks: ");
//         int marks = sc.nextInt();
//         String reportCard = marks >=33 ?"Pass" : "Fail";
//         System.out.println(reportCard);
//     }
// }

                // Switch statement
import java.util.*;
public class JavaPractice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("Apple");
                break;
            case 2 : System.out.println("Food");
                break;
            case 3 : System.out.println("Juice");
                break;
            default : System.out.println("Wake up to reality.");

        }
        sc.close();
    }
}