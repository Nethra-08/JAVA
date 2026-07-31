package arithmetic;

import java.util.Scanner;

interface Calculator {
    void add(double a, double b);
    void sub(double a, double b);
    void mul(double a, double b);
    void div(double a, double b);
}

public class Arithmetic implements Calculator {

    
    public void add(double a, double b) {
        System.out.println("Result = " + (a + b));
    }

    
    public void sub(double a, double b) {
        System.out.println("Result = " + (a - b));
    }

    
    public void mul(double a, double b) {
        System.out.println("Result = " + (a * b));
    }

    
    public void div(double a, double b) {
        if (b != 0)
            System.out.println("Result = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();

        System.out.println("Choose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                obj.add(a, b);
                break;

            case 2:
                obj.sub(a, b);
                break;

            case 3:
                obj.mul(a, b);
                break;

            case 4:
                obj.div(a, b);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
