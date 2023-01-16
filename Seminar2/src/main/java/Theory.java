public class Theory {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Какашонок");
        System.out.println(sb);
        System.out.println(sb.capacity()); // ёмкость
        System.out.println(sb.reverse()); // разворот текста
        System.out.println(sb.delete(2, sb.length() -2)); // удаление символов + длина текста
        System.out.println(sb.insert(sb.length() / 2, "-красота-")); // вставка в нужное место
        System.out.println(sb.deleteCharAt(12));  // удаление конкретного символа
        System.out.println(sb.append(" :)")); // добавление в конец текста
        System.out.println(sb.indexOf("кра")); // индекс начала подстроки
        String s = sb.toString(); // преобразование StringBuilder в String

        double begin = System.currentTimeMillis(); // возвращает целое число в формате double - кол-во мс
        String str = "";
        for (int i = 0; i < 20000; i++) {
            str += Character.getName(i); // возвращает название char
        }
        System.out.println(System.currentTimeMillis() - begin);

        begin = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(Character.getName(i));
        }
        System.out.println(System.currentTimeMillis() - begin);
    }
}
