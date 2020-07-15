import java.io.PrintWriter;
import java.util.Scanner;

public class Main1109 {

//    Следующее и предыдущее
//    (Время: 1 сек. Память: 16 Мб Сложность: 4%)
//    Напишите программу, которая считывает целое число и выводит текст с упоминанием следующего и предыдущего для него чисел.
//
//    Входные данные
//    Входной файл INPUT.TXT содержит целое число, не превосходящее 1000 по абсолютной величине.
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите текст, аналогичный приведенному в примере. При выводе следует учесть все пробелы и знаки препинания.
//
//            Пример
//    №	INPUT.TXT	OUTPUT.TXT
//    1	13          The next number for the number 13 is 14.
//                  The previous number for the number 13 is 12.

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
