import java.io.PrintWriter;
import java.util.Scanner;

public class Main1010 {

//    Последняя цифра
//    (Время: 1 сек. Память: 16 Мб Сложность: 3%)
//    Требуется определить последнюю цифру натурального числа.
//
//    Входные данные
//    Входной файл INPUT.TXT содержит натуральное число, не превосходящее 109.
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите последнюю цифру заданного числа.
//
//    Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	5	        5
//    2	273	        3

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int x = scanner.nextInt();
        printWriter.println(x%10);
    }

    public static void main(String[] args) {
        new Main1010().run();
    }
}
