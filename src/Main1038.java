import java.io.PrintWriter;
import java.util.Scanner;

public class Main1038 {

//    Перевязь
//    (Время: 1 сек. Память: 16 Мб Сложность: 12%)
//    Портос хочет украсить золотым шитьем свою перевязь. Он знает, что один сантиметр золотого шитья стоит один луидор. Портосу надо вышить N миллиметров перевязи. Причем мастер никогда не возьмется за работу, если ему заплатят меньше, чем стоит работа. И сдачу мастер никогда не отдает.
//
//    Какое минимальное количество луидоров Портос должен заплатить мастеру за работу?
//
//    Входные данные
//    Входной файл INPUT.TXT содержит натуральное число N (N ≤ 109) – длина перевязи в миллиметрах.
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите минимальное количество луидоров, которые Портос должен отдать за работу.
//
//    Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	200	        20
//    2	203	        21

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int x = scanner.nextInt();

        printWriter.println((x + 9)  / 10);
    }

    public static void main(String[] args) {
        new Main1038().run();
    }
}
