import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Theory {
    public static void main(String[] args) {
        // Массив:
        int[] ints = new int[10]; // самая быстрая коллекция
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(100);
        }

        int[] tmp = new int[ints.length + 1]; // это минус, для добавления элемента можно только создавать новый массив и копировать
        tmp[0] = ints[0];
        tmp[1] = 123;
        for (int i = 2; i < tmp.length; i++) {
            tmp[i] = ints[i - 1];
        }
        ints = tmp; // производительность не уменьшается, но сложность кода увеличивается

        // ArrayList
        // ArrayList list1 = new ArrayList();  можно не добавлять тип данных, но в ООП так лучше не делать
//        ArrayList<Integer> list = new ArrayList<>(); // так лучше и быстрее. Писать лучше ArrayList, а не List
//        list.add(123); // внутри списков обычный массив
//
//        for (int i = 0; i < 5; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        list.forEach(h -> System.out.print(h + "!, "));
//        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(rnd.nextInt(100));
        }

        for (int i = 0; i < 5; i++) {
            list2.add(rnd.nextInt(100));
        }

        list.forEach(nik -> System.out.print(nik + " "));
        System.out.println();
        list2.forEach(nik -> System.out.print(nik + " "));
        System.out.println();

        list.removeAll(list2);
        list.forEach(nik -> System.out.print(nik + " "));

        list.retainAll(list2);
        list.forEach(nik -> System.out.print(nik + " "));

        System.out.println();
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0; // по убыванию
            }
        });
        System.out.println(list2);

        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                if (t0 % 2 != 0 && t1 % 2 != 0) {
                    return -1;
                } else if (t0 % 2 == 0 && t1 % 2 == 0) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(list2);
    }

}
