import java.io.PrintWriter;
import java.util.Scanner;

public class Main1109 {

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int n = scanner.nextInt();

        StringBuilder builder = new StringBuilder()
                .append("The next number for the number " + n + " is " + (n + 1) + ".")
                .append("\n")
                .append("The previous number for the number " + n + " is " + (n - 1) + ".");
        printWriter.println(builder.toString());
    }

    public static void main(String[] args) {
        new Main1109().run();
    }
}
