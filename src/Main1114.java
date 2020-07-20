import java.io.PrintWriter;
import java.util.Scanner;

public class Main1114 {

//    МКАД
//    (Время: 1 сек. Память: 16 Мб Сложность: 11%)
//    Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася стартует с первого километра МКАД и едет со скоростью V километров в час. На какой отметке он остановится через T часов?
//
//    Входные данные
//    Первая строка входного файла INPUT.TXT содержит два целых числа V и T – скорость (км/ч) и время поездки в часах соответственно. Числа разделены пробелом. Если V>0, то Вася движется в положительном направлении по МКАД, если же значение V<0, то в отрицательном. Ограничения: |V| ≤ 1000, 0 ≤ T ≤ 1000.
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите целое число от 1 до 109 – километр МКАД, на котором остановится Вася.
//
//            Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	60 2	    12
//    2	-1 1	    109

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int v = scanner.nextInt();
        int t = scanner.nextInt();

        printWriter.println(((((v * t) % 109) + 109) % 109) + 1);
    }

    public static void main(String[] args) {
        new Main1114().run();
    }
}
