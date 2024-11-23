import java.util.Scanner;

public class OrderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want 'strict' or 'lenient' mode? ");
        String mode = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (mode.equals("strict")) {
            if (num1 < num2 && num2 < num3) {
                System.out.println("increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("decreasing");
            } else {
                System.out.println("neither");
            }
        } else if (mode.equals("lenient")) {
            if (num1 <= num2 && num2 <= num3) {
                if (num1 == num2 && num2 == num3) {
                    System.out.println("increasing and decreasing");
                } else {
                    System.out.println("increasing");
                }
            } else if (num1 >= num2 && num2 >= num3) {
                System.out.println("decreasing");
            } else {
                System.out.println("neither");
            }
        } else {
            System.out.println("Invalid mode. Please enter 'strict' or 'lenient'.");
        }

        scanner.close();
    }
}
