// Создать файл с текстом и считать его в терминал
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Practice {
    public static void main(String[] args) {
        String str = "";
        try {
            FileWriter wr = new FileWriter("NewFile.txt");
            wr.append("Тестовое задание\n");
            wr.append("Что-то ещё\n");
            wr.flush();


            FileReader rd = new FileReader("NewFile.txt");
            while (rd.ready()) {
                str += (char)rd.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(str);
    }
}
