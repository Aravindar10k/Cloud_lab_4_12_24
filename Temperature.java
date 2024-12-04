import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter temp in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " = " + fahrenheit + " Fahrenheit");
        } else if (choice == 2) {
            System.out.print("Enter temp in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " = " + celsius + " Celsius");
        } else {
            System.out.println("Invalid choice.");
        }

        scan.close();
    }
}
