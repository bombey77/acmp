import java.io.PrintWriter;
import java.util.Scanner;

public class Main903 {

//    Бисер
//    (Время: 1 сек. Память: 16 Мб Сложность: 2%)
//    В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес. Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.
//
//    Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так, чтобы среди них гарантированно были две бусины одного цвета.
//
//    Входные данные
//    Входной файл INPUT.TXT содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите ответ на поставленную задачу.
//
//    Пример
//№	  INPUT.TXT	OUTPUT.TXT
//1	  3	        4

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int n = scanner.nextInt();

        int result = n + 1;
        printWriter.println(result);
    }

    public static void main(String[] args) {
        new Main903().run();
    }
}
