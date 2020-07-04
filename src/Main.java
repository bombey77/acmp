import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int x = scanner.nextInt();

        printWriter.println(x);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}