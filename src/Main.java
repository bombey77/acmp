import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

//    Требуется сложить два целых числа А и В.
//
//    Входные данные
//    В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.
//
//    Выходные данные
//    В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printWriter.println(a + b);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
