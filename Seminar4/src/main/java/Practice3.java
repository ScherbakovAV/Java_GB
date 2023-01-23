// Не доделано!

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

// все данные записать в ArrayList и отсоритовать все списки по одному из них

public class Practice3 {
    public static void main(String[] args) {
        String str = "";
        ArrayList<String> familyName = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> indexes = new LinkedList<>();

        try {
            FileReader fr = new FileReader("db2.sql");
            while (fr.ready()) {
                str += (char)fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String [] strArray = str.split("\n");
        for (int i = 0; i < strArray.length; i++) {
            String [] strTmp = strArray[i].split(" ");
            familyName.add(strTmp[0]);
            name.add(strTmp[1]);
            surName.add(strTmp[2]);
            age.add(Integer.parseInt(strTmp[3]));
            gender.add(strTmp[4].equals("М")?false : true);
            indexes.add(i);
        }

        printList(indexes, familyName);
    }

    private static void printList(LinkedList lstIndex, ArrayList arr) {
        for (int i = 0; i < lstIndex.size(); i++) {
            System.out.print(arr.get((Integer) lstIndex.get(i)) + ", ");
        }
    }

    //private static void sortArr(LinkedList lstIndex, ArrayList arr);
}
