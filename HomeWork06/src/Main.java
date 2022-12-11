import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    static selfMadeSet smSet = new selfMadeSet();
    public static void main(String[] args) {
        // Реализовать множество (set) с помощью TreeMap.
        // Создать метод add, добавляющий элемент в ваше множество.

        System.out.println("Случайно добавляемые числа в множество созданное с помощью TreeMap:");
        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(-10, 30);
            if (i != 9) {
                System.out.print(a + ", ");
            }
            else {
                System.out.println(a);
            }
            smSet.add(a);
        }
        smSet.add(1); smSet.add(11); smSet.add(15);
        System.out.println("Не сортированный set:");
        System.out.println(smSet.printSet());
        System.out.println();
        // Объявить и инициализировать компаратор с обратной (от большего к меньшему) логикой сортировки чисел.
        Comparator reverseComparator = Comparator.reverseOrder();
        // Объявить и инициализировать TreeSet использующий ваш компаратор.
        TreeSet myTreeSet = new TreeSet(reverseComparator);
        // Добавить несколько эллементов в сет и вывести в консоль.
        System.out.println("Случайно добавляемые числа в множество TreeSet:");
        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(-10, 30);
            if (i != 9) {
                System.out.print(a + ", ");
            }
            else {
                System.out.println(a);
            }
            myTreeSet.add(a);
        }
        myTreeSet.add(1); myTreeSet.add(11); myTreeSet.add(15);
        System.out.println("TreeSet, отсортированный с помощью компаратора обратной логики:");
        System.out.println(myTreeSet);
    }
}