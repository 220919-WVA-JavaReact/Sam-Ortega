import java.util.Scanner;
/* So I tried to make a calculator in java. and this is the result of what I could
research and figure out.
 */

// I looked up how to read the input from the user and I found Scanner, which has many methods.
/*
Scanner is a class in java. util package used for obtaining the input of
the primitive types like int, double, etc. and strings.
*/

// I had to look more into what Scanner does, or more like what it can do and I found this.
/*
scans the next token of the input data as an “int”. As the name of the class Scanner elaborates,
nextInt() method of this class is used to scan or parse the input.
 */

class Main{
    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("First number :");
        num1 = input.nextInt();

        System.out.println("Second number :");
        num2 = input.nextInt();

        // Now I'm using the Scanner to check for the operator.
        // I found that the Scanner can also read input from the user with .next().
        Scanner operate = new Scanner(System.in);
        System.out.println("Pick and operation (+, -, /, *)");
        operation = operate.next();
        // so I have the input down. but now I need my conditionals.

        if (operation.equals("+")){
            System.out.println("The answer is" + " " + (num1 + num2));
        }
        else if (operation.equals("-")){
            System.out.println("The answer is" + " " + (num1 - num2));
        }
        else if (operation.equals("/")){
            System.out.println("The answer is" + " " + (num1 / num2));
        }
        else if (operation.equals("*")){
            System.out.println("The answer is" + " " + (num1 * num2));
        }

    }
}