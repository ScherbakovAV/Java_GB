import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

    public class FromRafael {
        public static void main(String[] args) {
            // Создать текстовый файл потом его считать.

            ArrayList<String> family = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> soname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gender = new ArrayList<>();
            LinkedList<Integer> index = new LinkedList<>();

            String text = "";
            try {
//            FileWriter fileWriter = new FileWriter("bd.sql",true);
//            fileWriter.append("Hello word");
//            fileWriter.flush();
//            fileWriter.close();

                FileReader fileReader = new FileReader("bd.sql");

                while (fileReader.ready()) {
                    text += (char) fileReader.read();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String[] str = text.split("\n");
            boolean booleanGender;
            for (int i = 0; i < str.length; i++) {
                String[] sb = str[i].split(" ");
                family.add(sb[0]);
                name.add(sb[1].charAt(0) + ".");
                soname.add(sb[2].charAt(0) + ".");
                age.add(Integer.valueOf(sb[3]));
//            booleanGender = (sb[4] == "M" ? true : false);
                gender.add(sb[4].equals("Ж") ? true : false);
                index.add(i);
            }
            index.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            // пузырьковая сортировка возрастов, но переставляем индексы в index

            for (int i = 0; i < index.size(); i++) {

                System.out.printf(family.get(index.get(i)));
                System.out.printf(name.get(index.get(i)));
                System.out.printf(soname.get(index.get(i)));
                System.out.printf(age.get(index.get(i)).toString());
                System.out.printf((gender.get(index.get(i)) ? " M" : " Ж"));
                System.out.println();
            }

            System.out.println(family);

        }
    }

