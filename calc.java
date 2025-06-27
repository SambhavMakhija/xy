import java.util.Scanner;

public class ChillCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("🚀 Welcome to the Chill Calculator 🚀");
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        double result = 0;
        boolean valid = true;

        switch(op) {
            case '+': 
                result = num1 + num2;
                break;
            case '-': 
                result = num1 - num2;
                break;
            case '*': 
                result = num1 * num2;
                break;
            case '/': 
                if(num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Can't divide by zero bro 😵‍💫");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operation, try again fam 🚫");
                valid = false;
        }
        
        if(valid)
            System.out.println("Result: " + result);

        System.out.println("Thanks for using the Chill Calculator ✨");
    }
}
