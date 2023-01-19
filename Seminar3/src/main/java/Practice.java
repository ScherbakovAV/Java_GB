import java.util.ArrayList;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        // 1. Заполнить рандомно список и отсортировать его по уменьшению.
        ArrayList<Integer> lst = new ArrayList<>(10);
    }
    private static ArrayList<Integer> addRndTooList(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(0, 1001));
        }
        return list;
    }
    private static ArrayList<Integer> sortedList(ArrayList<Integer> list) {
        ArrayList<Integer> sortedLst = new ArrayList<>();
        int max = list.get(0);
        int min = list.get(0);

//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) >= list.get(i - 1)) {
//                int temp = list.get(i - 1);
//                list.get(i - 1) = list.get(i);
//                list.get(i) = temp;
//            }
//        }
//        int index = list.size();
//
//        while (index > 0) {
//            for (int i = 0; i < ; i++) {
//
//            }
//        }
        return sortedLst;
    }
}
