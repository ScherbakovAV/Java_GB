package HW6WithClass;
import java.util.HashMap;

public class MyHashSet {
    static HashMap<Integer, Object> hmap;
    static final Object OBJ = new Object();
    public MyHashSet() {
        hmap = new HashMap<>();
    }
    public static void addToSet(HashMap<Integer, Object> hm, int number) {
        hm.put(number, OBJ);
    }
    public static void printSet(HashMap<Integer, Object> hm) {
        if (!hm.isEmpty()) {
            Object[] keyMap = hm.keySet().toArray();
            System.out.println("Введённые числа без повторений:");
            for (Object el : keyMap) {
                System.out.print(el + " ");
            }
        }
        else System.out.println("Список пуст...");
    }

    public static HashMap<Integer, Object> getHmap() {
        return hmap;
    }
}
