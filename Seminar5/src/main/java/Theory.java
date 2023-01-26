import java.util.*;

public class Theory {
    public static void main(String[] args) {
        // сортировка с использованием sort для прошлого ДЗ
        /*LinkedList<Integer> index = new LinkedList<>();
        ArrayList<String> family = new ArrayList<>();
        Collections.sort(family); // сортировка списка

        ArrayList<String> tmp = new ArrayList<>(family); // копия списка
        Collections.sort(tmp);
        Collections.sort(family);

        for (int i = 0; i < tmp.size(); i++) {
            int j = family.indexOf(tmp.get(i));
            index.set(i, j);
        }

        for (Integer i : index) {
            System.out.println(family.get(i) + " ");
        }*/
        // _____________________________________________________________
        /* Теория по теме лекции 5
        //--------HASHMAP--------
        Для одинаковых ключей хэш гарантированно разный,
         а для разных ключей он необязательно будет разный
         Коллизия - это когда одинаковый хэш. Хэшей 16 по умолчанию.*/

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "One");
        hashMap.put("2", "Two");
        hashMap.putIfAbsent("1", "AnotherOne"); // запись с проверкой
        hashMap.put("3", "Three");
        System.out.println(hashMap.containsKey("1"));
        System.out.println(hashMap.containsKey("4"));
        System.out.println(hashMap.hashCode());

        Set<String> keySet = hashMap.keySet();
        Collection<String> sValues = hashMap.values();
        Set<Map.Entry<String,String>> eSet = hashMap.entrySet();

        System.out.println(keySet); // все ключи
        System.out.println(sValues); // все значения
        System.out.println(eSet); // все пары ключ-значение

        for (int i = 0; i < keySet.size(); i++) {
            // чтобы получить доступ к элементам map, в них нет последовательности,
            // надо работать через ключи, используя keySet
            System.out.println(hashMap.get(keySet.toArray()[i]));
        }

        for (String value : hashMap.keySet()) {
            // другой вариант вывода
            System.out.println(value);
            // hashMap.remove("1"); // В foreach нельзя изменить источник данных
        }

        // hashMap.remove((keySet.toArray()[0])); // так можно удалять по индексу

        // Как и в предыдущем способе, только через итератор
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String l = iterator.next();
            System.out.println(l);
            // if (l.equals("3")) iterator.remove(); // так можно удалять
        }

        hashMap.forEach((k, v) -> System.out.println(k + " " + v)); // печать с помощью лямбда функции

        hashMap.compute("1", (k, v) -> v+= "!"); // изменяет значения элементов
        hashMap.compute("1", (k, v) -> v = v.toUpperCase());
        hashMap.computeIfPresent("1", (k, v) -> v = v.toLowerCase()); //если существует
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));

        //--------LINKEDHASHMAP--------
        // расширяет hashMap - запоминает последовательность записи элементов,
        // но он немного медленнее обычного hashMap (самый быстрый - массив)

        LinkedHashMap<String, String> lhashMap = new LinkedHashMap<>();
        lhashMap.put("1", "One");
        lhashMap.put("2", "Two");
        lhashMap.putIfAbsent("1", "AnotherOne"); // запись с проверкой
        lhashMap.put("3", "Three");
        lhashMap.forEach((k, v) -> System.out.println(k + " " + v));

        //--------TREEMAP--------
        // Двоичное дерево. У этого map есть компаратор. У этой коллекции очень быстрое чтение.
        // Есть минус в использовании - если каждое значение больше предыдущего,
        // то дерево выстраивается в линейный массив. Ещё есть проблема с разворотом дерева,
        // когда добавляется ключ с близким к корню значением. Добавление элемента может быть очень долгим.
        // Это не наследник hashMap.

        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(15, "zero");
        tMap.tailMap(2, true);
    }
}
