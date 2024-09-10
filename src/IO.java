import java.util.Scanner;

public class IO {
    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;

        while(!valid) {
            System.out.println(message);

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                valid = true;
            } else {
                scanner.next();
            }
        }

        return input;
    }
}
