import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("This is a mini calculator");
            System.out.print("Please input the first number: ");
            long first_number = scanner.nextLong();
            System.out.print("Please input the second number: ");
            long second_number = scanner.nextLong();
            scanner.nextLine(); // Consume the newline character left in the buffer.

            System.out.print("Please input math operation (addition, subtraction, multiplication, or division): ");
            String type = scanner.nextLine();

            if (type.equals("addition")) {
                System.out.println("Result: " + (first_number + second_number));
            } else if (type.equals("subtraction")) {
                System.out.println("Result: " + (first_number - second_number));
            } else if (type.equals("multiplication")) {
                System.out.println("Result: " + (first_number * second_number));
            } else if (type.equals("division")) {
                if (second_number != 0) {
                    System.out.println("Result: " + (first_number / second_number));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } else {
                System.out.println("Please input a valid math operation.");
            }
        }
    }
}