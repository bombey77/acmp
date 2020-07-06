import java.io.PrintWriter;
import java.util.Scanner;

public class Main92 {

//    Журавлики
//    (Время: 1 сек. Память: 16 Мб Сложность: 7%)
//    Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов. Сколько журавликов сделал каждый ребенок, если известно, что Петя и Сережа сделали одинаковое количество журавликов, а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?
//
//    Входные данные
//    В единственной строке входного файла INPUT.TXT записано одно натуральное число S – общее количество сделанных журавликов (S < 106).
//
//    Выходные данные
//    В единственную строку выходного файла OUTPUT.TXT нужно вывести три числа, разделенных пробелами – количество журавликов, которые сделал каждый ребенок (Петя, Катя и Сережа).
//
//      Примеры
//      №	    INPUT.TXT	OUTPUT.TXT
//      1	    6	        1 4 1
//      2	    24	        4 16 4
//      3	    60	    10 40 10

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int x = scanner.nextInt();

        printWriter.printf("%d %d %d", (x/3)/2, (x/3)*2, (x/3)/2);
    }

    public static void main(String[] args) {
        new Main92().run();
    }
}
