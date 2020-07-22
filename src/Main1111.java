import java.io.PrintWriter;
import java.util.Scanner;

public class Main1111 {

//    Число десятков
//    (Время: 1 сек. Память: 16 Мб Сложность: 5%)
//    Требуется определить число десятков в заданном натуральном числе в его десятичной записи (то есть найти предпоследнюю цифру в числе).
//
//    Входные данные
//    Входной файл INPUT.TXT содержит натуральное число, не превосходящее 109.
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите ответ на задачу.
//
//            Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	123	        2
//    2	46	        4

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int x = scanner.nextInt();

        printWriter.println((x % 100) / 10);
    }

    public static void main(String[] args) {
        new Main1111().run();
    }
}
