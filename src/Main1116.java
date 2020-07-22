import java.io.PrintWriter;
import java.util.Scanner;

public class Main1116 {

//    Разность времен
//    (Время: 1 сек. Память: 16 Мб Сложность: 9%)
//    Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, минуты и секунды для каждого из моментов времени. Известно, что второй момент времени наступил не раньше первого. Определите, сколько секунд прошло между двумя моментами времени. Программа на вход получает три целых числа – часы, минуты, секунды, задающие первый момент времени и три целых числа, задающих второй момент времени. Выведите число секунд между этими моментами времени.
//
//            Входные данные
//    Входной файл INPUT.TXT содержит две строки, в каждой из них записан момент времени: в первой строке – начальный, во второй – конечный. Каждое описание времени состоит из трех целых неотрицательных чисел: H, M и S – часы, минуты и секунды (H ≤ 23, M ≤ 59, S ≤ 59).
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите одно неотрицательное целое число – число секунд между заданными моментами времени.
//
//    Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	 1 1 1
//       2 2 2	     3661
//    2	 1 2 30
//       1 3 20	      50

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        scanner.nextLine();
        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        int ss = scanner.nextInt();

        printWriter.println(((hh*3600) + (mm*60) + ss) - ((h*3600) + (m*60) + s));
//        printWriter.println(  (((hh*60) + (mm*60) * 60) + ss) - (((h*60) + (m*60) * 60) + s));
    }

    public static void main(String[] args) {
        new Main1116().run();
    }
}
