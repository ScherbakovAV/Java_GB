package HW6WithClass;
import java.util.Random;

import static HW6WithClass.MyHashSet.*;

public class Main {
    public static void main(String[] args) {
        new MyHashSet();
        var coll = getHmap();

        Random rnd = new Random();
        System.out.println("Введённые числа:");
        for (int i = 0; i < 10; i++) {
            int tmp = rnd.nextInt(1, 10);
            addToSet(coll, tmp);
            System.out.print(tmp + " ");
        }
        System.out.println();

        printSet(coll);
    }
}
