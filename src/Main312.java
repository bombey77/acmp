import java.io.PrintWriter;
import java.util.Scanner;

public class Main312 {

//    Арифметическая прогрессия
//    (Время: 1 сек. Память: 16 Мб Сложность: 15%)
//    Заданы первый и второй элементы арифметической прогрессии. Требуется написать программу, которая вычислит элемент прогрессии по ее номеру.
//
//            Входные данные
//    Входной файл INPUT.TXT содержит три целых числа, разделенных пробелами – первый элемент прогрессии A1 (1 ≤ A1 ≤ 1000), второй элемент прогрессии A2 (1 ≤ A2 ≤ 1000), и номер требуемого элемента N (1 ≤ N ≤ 1000).
//
//    Выходные данные
//    Выходной файл OUTPUT.TXT должен содержать одно целое число - N-й элемент арифметической прогрессии.
//
//    Пример
//    №	INPUT.TXT	OUTPUT.TXT
//    1	1 5 3	    9
//    Пояснение к примеру
//    Здесь речь идет о следующей последовательности чисел:
//
//    1, 5, 9, 13, 17, 21, …
//    В данной последовательности D=4, поэтому A1=1, A2=A1+D=5, A3=A1+2*D=9, и т.д. Поскольку нам нужно было найти 3й элемент прогрессии, то ответом на задачу является число 9.

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int n = scanner.nextInt();

        printWriter.println(a1 + (a2 - a1) * (n - 1));
    }

    public static void main(String[] args) {
        new Main312().run();
    }
}
