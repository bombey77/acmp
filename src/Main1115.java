import java.io.PrintWriter;
import java.util.Scanner;

public class Main1115 {

//    Дележ яблок
//    (Время: 1 сек. Память: 16 Мб Сложность: 15%)
//    N школьников желают разделить K яблок между собой. Они рассматривают два способа дележа:
//
//    разделить яблоки поровну так, чтобы каждому досталось максимальное количество яблок, при этом оставшиеся яблоки можно положить в корзину;
//    разделить все яблоки так, чтобы количество яблок, доставшихся любым двум школьникам, отличалось бы не более, чем на 1. В этом случае могут обидеться те из них, кому достанется яблок меньше, чем другим.
//    Входные данные
//    Входной файл INPUT.TXT содержит натуральные числа N и K – количество школьников и яблок соответственно (N,K ≤ 109).
//
//    Выходные данные
//    В выходной файл OUTPUT.TXT выведите три целых числа через пробел:
//
//    количество яблок, которые достанутся всем школьником при первом способе дележа;
//    количество яблок, которые окажутся в корзине при первом способе дележа;
//    количество обиженных школьников во втором случае дележа.
//            Примеры
//    №	INPUT.TXT	OUTPUT.TXT
//    1	7 30	    4 2 5
//    2	5 15	    3 0 0

    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            solve(scanner, printWriter);
        }
    }

    public void solve(Scanner scanner, PrintWriter printWriter) {
        int nPupils = scanner.nextInt();
        int nApples = scanner.nextInt();

        printWriter.println(nApples / nPupils + " " + nApples % nPupils + " " + (nPupils -nApples%nPupils) % nPupils);
    }

    public static void main(String[] args) {
        new Main1115().run();
    }
}
