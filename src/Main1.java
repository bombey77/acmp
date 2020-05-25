import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {

//    Дана прямоугольная клеточная доска размера M × N клеток. Также дано неограниченное количество стандартных доминошек размера 2 × 1 клетку. Доминошки можно поворачивать. Требуется уложить как можно больше доминошек на доску так, чтобы соблюдались следующие условия:
//
//    1. Каждая доминошка полностью покрывает две клетки доски.
//
//    2. Никакие две доминошки не перекрываются.
//
//    3. Каждая доминошка полностью лежит внутри доски. Касание краев доски допускается.
//
//    Найдите максимальное количество доминошек, которое можно уложить с данными ограничениями.
//            Входные данные
//
//    В единственной строке записано два целых числа M и N — размеры доски в клетках (1 ≤ M ≤ N ≤ 16).
//    Выходные данные
//
//    Выведите одно число — максимальное количество доминошек, которое можно уложить.

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int res = 0;
        if (m%2 == 0) {
            res = (m * n) / 2;
        } else {
            res = ((m * n) - 1) / 2;
        }

        printWriter.println(res);
    }

    public static void main(String[] args) {
        new Main1().run();
    }
}
