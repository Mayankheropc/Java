package staticMethod; 
public class ValueChange 
{ 
 static int a = 10; 
 static int change() 
 { 
   int a = 20; 
   return a; 
 } 
public static void main(String[] args) 
 { 
// Call static method using the class name. Since it will return an integer value. So we will store it by using a changeValue variable. 
    int changeValue = ValueChange.change(); 
    System.out.println(changeValue); 
 } 
}
