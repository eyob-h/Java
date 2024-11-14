
import java.util.Arrays;

public class Basics {
    public static void main(String[] args){
        // System.out.println("Hi There!");
        
        // Primitives
        // int num1 = 5;
        // int num2 = 10;
        // int num3 = 100_000_000;
        // double pi = 3.14;
        // char z = 'A';


        // System.out.println("Name" + z);
        // System.out.println(num1+num2);
        // System.out.println(num3);

        // single line comment

        /*
        Multi line
        comment
        */


        // Arithmetic Operators
        double num1 = 23;
        float num2 = 4;
        
        System.out.println(num1 + " divided by " + num2 + "  is " + num1 / num2 );
        System.out.println(num1 + " multiplied by " + num2 + "  is " + num1 * num2 );
        System.out.println(num1 + " modulo " + num2 + "  is " + num1 % num2 );
        System.out.println(0 + " modulo " + num2 + "  is " + 0 % num2 );
        
        // Order of precedence 
        int a = 10;
        int b = 5;
        int c = 2;

        // Using various operators
        int result = a + b * c - (a / b) - (c % 2) + (a--);
        
        System.out.println("Result: " + result);
        System.out.println("Value of a after post-decrement: " + a); 
        
        // Increment and decrement operators
        int num5 = 9;
        System.out.println("Post-increment: " + num5++); 
        System.out.println("Value of a after post-increment: " + num5); 
        int num6 = 23;
        System.out.println("Pre-increment: " + ++num6); 
        System.out.println("Value of a after pre-increment: " + num6); 
        
        // Comparison Operators
        System.out.println(10<5); 
        System.out.println(10>5); 
        System.out.println(10<=5); 
        System.out.println(10>=5); 
        System.out.println(10==5); 

        // Shorthand assignment
        int x = 5;
        int y = 3;
        int z *= 5;
        int z /= 5;
        int z %= 5;
        int z ^= 5;
        System.out.println(z); 


        // Naming Variables
        /*
        
        1. Make'em meaningful
        2. User lowercase for single words
        3. User camelCase for multiple words
        4. Phrase boolean variable names as questions

        */

       int count = 5;
       int numberOfEmployees = 315;
       boolean isAdmin = true;


      // Strings
       String companyName = "TechSol";
       String companyName2 = "  ";
       System.out.println(companyName); 
       System.out.println(companyName.toUpperCase()); 
       System.out.println(companyName.toLowerCase()); 
       System.out.println(companyName.isBlank()); 
       System.out.println(companyName2.isEmpty()); 
       System.out.println(companyName2.isBlank());  

        // Arrays
        // Declaration
        //    int[] numbers;           
        //    int scores[];          

       // Initialization
       int[] numbers = new int[5];                    // Creates array of size 5 with default values
       int[] scores = {90, 85, 93, 78, 88};          // Array literal
       String[] names = new String[]{"Ana", "Bob"};   // Another initialization method    

	   System.out.println(scores);                   // Reference type
	   System.out.println(scores[2]);  

       int[] intArray = new int[5]; // All elements are initialized to 0
       String[] stringArray = new String[5]; // All elements are initialized to null

       Arrays.fill(intArrays, 8);


    }
}

