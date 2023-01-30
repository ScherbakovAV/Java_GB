import java.util.*;

// имитировать HashSet
public class Classwork {
    private static HashMap<Integer, Object> hmap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        /*ArrayList<Integer> arr = new ArrayList<>();
        addToColl(25, arr);
        addToColl(2, arr);
        addToColl(18, arr);
        addToColl(25, arr);
        addToColl(8, arr);
        addToColl(11, arr);
        addToColl(32, arr);
        System.out.println(arr);*/

        addToHMap(25);
        addToHMap(1);
        addToHMap(3);
        addToHMap(25);
        addToHMap(15);
        addToHMap(4);
        addToHMap(8);
        System.out.println(hmap.keySet());
        System.out.println(isEmpty());
        entryPrint();
        System.out.println();
        System.out.println(getKey(2));
        try {
            System.out.println(getKey(10));
        } catch (Exception e) {
            System.out.println("такого индекса нет");
        }

        Iterator<Integer> iterator = hmap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    /*public static void addToColl(Integer number, ArrayList<Integer> arr) { // наш метод
        if (!arr.contains(number)){
            arr.add(number);
            Collections.sort(arr);
        }
    }*/
    private static void addToHMap(Integer number) { // через hashMap
        hmap.put(number, OBJ);
    }

    private static boolean isEmpty() {
        return hmap.isEmpty();
    }

    private static void entryPrint() {
        Object[] tmp = hmap.keySet().toArray();
        for (Object el : tmp) {
            System.out.print((Integer) el + " ");
        }
    }

    private static int getKey(Integer index) {
        Object[] tmp = hmap.keySet().toArray();
        return (Integer) tmp[index];
    }
}
