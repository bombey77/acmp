import java.io.PrintWriter;
import java.util.Scanner;

public class Main195 {

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printWriter.println(n * (a * b) * 2);
    }

    public static void main(String[] args) {
        new Main195().run();
    }
}