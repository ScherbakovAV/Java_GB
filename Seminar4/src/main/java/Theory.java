import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Theory {
    public static void main(String[] args) {
        try {
            /*FileWriter writer = new FileWriter("db.sql");
            writer.append("Привет!"); // добавление в конец файла
            writer.flush(); // закрытие файла*/

            String str = "";
            FileReader reader = new FileReader("db.sql");
            while ((reader.ready())){
                str += (char)reader.read(); // читает только char
            }

            System.out.println(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // str.split(" ");
        // LinkedList<String> list1; - быстрое чтение
        // ArrayList<String> list2; - быстрая сортировка
    }
}
