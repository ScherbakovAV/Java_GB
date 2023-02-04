import java.util.*;

public class Homework6 {
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        HashMap<Integer, Object> hmap = new HashMap<>();
        addToSet(hmap);
        printSet(hmap);
    }
    private static void addToSet(HashMap<Integer, Object> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ряд целых чисел через пробел или \"q\" для отмены:");
        while (true) {
            try {
                String str = input.nextLine();
                if (str.equals("q") || str.equals("Q") || str.equals("й") || str.equals("Й")) break;
                String[] enteredNums = str.split(" ");
                for (String Num : enteredNums) {
                    list.put(Integer.parseInt(Num), OBJ);
                }
                input.close();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы допустили ошибку. Повторите ввод...");
            }
        }
    }
    private static void printSet(HashMap<Integer, Object> hashMap) {
        if (!isHmapEmpty(hashMap)) {
            Object[] keyMap = hashMap.keySet().toArray();
            System.out.println("введённые числа без повторений:");
            for (Object el : keyMap) {
                System.out.print(el + " ");
            }
        }
        else System.out.println("Список пуст...");
    }
    private static boolean isHmapEmpty(HashMap<Integer, Object> hashMap) {
        return hashMap.isEmpty();
    }
}
