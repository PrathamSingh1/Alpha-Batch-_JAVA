import java.util.*;
public class JavaArea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius :");
        Float radius = sc.nextFloat();
        Float area = 3.14f*radius*radius;
        
        System.out.println("The area of circle is : " + area);


        sc.close();
    }

}