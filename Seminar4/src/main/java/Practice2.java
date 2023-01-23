import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// вывести форматированный текст из БД
public class Practice2 {
    public static void main(String[] args) {
        String str = "";
        try {
            /*FileWriter wr = new FileWriter("db2.sql");
            wr.append("Семёнов Алексей Геннадьевич 43 М\n");
            wr.append("Сидоров Павел Иннокентьевич 19 М\n");
            wr.append("Арутюнян Белла Олеговна 25 Ж\n");
            wr.append("Горбань Анна Артёмовна 33 Ж\n");
            wr.append("Сидоров Александр Сергеевич 23 М\n");
            wr.append("Цын Алёна Петровна 65 Ж\n");
            wr.append("Петров Петр Сергеевич 19 М\n");
            wr.append("Янковский Нестор Николаевич 29 М\n");
            wr.append("Мелешко Валентина Петровна 30 Ж\n");
            wr.flush();*/

            FileReader rd = new FileReader("db2.sql");
            while (rd.ready()) {

                str += (char)rd.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String [] strArray = str.split("\n");
        for (int i = 0; i < strArray.length; i++) {
            String [] strTmp = strArray[i].split(" ");
            System.out.printf("%s %s.%s.: %s, %s\n", strTmp[0], strTmp[1].toUpperCase().charAt(0), strTmp[2].toUpperCase().charAt(0), strTmp[3], strTmp[4]);
        }
    }
}
