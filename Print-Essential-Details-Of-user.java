import java.util.*; 
import java.util.Scanner;
public class Input 
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name = sc.next();
    
    System.out.print("Enter Age: ");
    int age = sc.nextInt();  
    
    System.out.print("Enter Mobile number: ");
    String mn = sc.next();
    
    sc.close();
    System.out.println("Name = " + name);
    System.out.println("Age = " + age);
    System.out.println("Mobile Number = " + mn);
}
}
