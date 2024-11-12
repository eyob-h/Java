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

        // Arithmetic Operators
        double num1 = 23;
        float num2 = 4;
        
        System.out.println(num1 + " divided by " + num2 + "  is " + num1/num2 );
        System.out.println(num1 + " multiplied by " + num2 + "  is " + num1*num2 );
        System.out.println(num1 + " modulo " + num2 + "  is " + num1%num2 );
        System.out.println(0 + " modulo " + num2 + "  is " + 0%num2 );
        
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
        
    }
}

// single line comment

/*
Multi line
comment
*/
