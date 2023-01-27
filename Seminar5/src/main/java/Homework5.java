import java.util.*;

/*
1. Создать словарь HashMap. Обобщение <Integer, String>.
2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
3. Изменить значения, сделав пол большой буквой.
4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
5*. Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
*/
public class Homework5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.putIfAbsent(1, "Иванов Иван Иванович 28 м");
        hMap.putIfAbsent(2, "Сидоренко Максим Иванович 22 м");
        hMap.putIfAbsent(3, "Кравченко Ольга Михайловна 45 ж");
        hMap.putIfAbsent(4, "Савченко Екатерина Евгеньевна 52 ж");
        hMap.putIfAbsent(5, "Беляев Антон Леонидович 19 м");

        Set<Integer> keySet = hMap.keySet(); // исходная коллекция ключей

        for (Integer i: keySet) { // замена буквы пола на большую
            String valueOld = hMap.get(keySet.toArray()[i - 1]);
            String[] tmpArr = valueOld.split(" ");
            tmpArr[tmpArr.length - 1] = tmpArr[tmpArr.length - 1].toUpperCase();
            String valueNew = "";
            for (int j = 0; j < tmpArr.length; j++) {
                if (j < tmpArr.length - 1) valueNew += tmpArr[j] + " ";
                else valueNew += tmpArr[j];
            }
            hMap.replace(i, valueOld, valueNew);
        }

        hMapPrintFormatted(hMap, new ArrayList<>(keySet), "Созданная коллекция:");

        ArrayList<Integer> toSortAge = new ArrayList<>(); // отсортированный список возрастов из hashMap
        for (int i = 0; i < keySet.size(); i++) {
            toSortAge.add(Integer.valueOf(hMap.get(keySet.toArray()[i]).split(" ")[3]));
        }

        ArrayList<Integer> keySorted = new ArrayList<>(keySet); // отсортированный список ключей по возрасту
        for (int i = 0; i < toSortAge.size(); i++) {
            for (int j = 0; j < toSortAge.size() - 1; j++) {
                if (toSortAge.get(j) > toSortAge.get(j + 1)) {
                    int temp = toSortAge.get(j);
                    toSortAge.set(j, toSortAge.get(j + 1));
                    toSortAge.set(j + 1, temp);

                    temp = keySorted.get(j);
                    keySorted.set(j, keySorted.get(j + 1));
                    keySorted.set(j + 1, temp);
                }
            }
        }

        System.out.println();
        hMapPrintFormatted(hMap, keySorted, "Сортированная по возрасту коллекция:");
    }

    private static void hMapPrintFormatted(HashMap<Integer, String> map, ArrayList<Integer> lst, String str) {
        System.out.println(str);
        for (int i = 0; i < lst.size(); i++) {
            String[] strTmp = map.get(lst.toArray()[i]).split(" ");
            System.out.printf("%s %s.%s. %s %s\n", strTmp[0], strTmp[1].charAt(0), strTmp[2].charAt(0), strTmp[3], strTmp[4]);
        }
    }
}