import java.io.PrintWriter;
import java.util.Scanner;

public class Main1112 {

//    Сумма цифр числа
//    (Время: 1 сек. Память: 16 Мб Сложность: 7%)
//    Найдите сумму цифр трехзначного натурального числа.
//
//    Входные данные
//    Входной файл INPUT.TXT содержит трехзначное натуральное число.
//
//            Выходные данные
//    В выходной файл OUTPUT.TXT выведите сумму цифр заданного числа.
//
//    Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	100	        1
//    2	123	        6

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int x = scanner.nextInt();

        printWriter.println(((x/100) + (x/10)%10) + (x%10));
    }

    public static void main(String[] args) {
        new Main1112().run();
    }
}
