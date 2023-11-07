import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write sentence: ");
        String txt = scanner.nextLine();
        System.out.println(txt.length());

        scanner.close();
    }
}
