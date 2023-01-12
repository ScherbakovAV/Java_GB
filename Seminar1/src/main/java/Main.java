import java.util.Random;

public class Main {
    public static void main(String[] args) {
        print("Hello");
        int i = 0; // 32 бита целочисленный
        long l = 0; // 64 бита целочисленный
        short s = 0;
        byte b = 0;
        float f = 0.0f; // 32 бита дробный
        double d = 0.0; // 64 бита дробный
        char c = '1'; // 16 бит беззнаковый
        boolean b1 = true;

        int[] ai = new int[10];

        Random rnd = new Random();

        for (int j = 0; j < ai.length; j++) {
            ai[j] = rnd.nextInt();
        }

        for (int k = 0; k < ai.length; k++) {
            print(String.valueOf(ai[k]));
        }

        print(String.valueOf(ai.length));

        int[] tmp = new int[ai.length + 5];
        ai = tmp; // увеличение размера массива

        String str = "Привет";
        str += ", Чувак!";



        print(str);
        str.toLowerCase();
        print(str); // не меняется, т.к. строки неизменны
        print(str.toLowerCase());
        print(String.valueOf(str.contains("ив")));
        print(String.valueOf(str.contains("яв")));
        print(str.substring(1, str.length()/2));
        print(str.replace("и", "ю"));
        String[] strA = str.split(" ");

        for (int m = 0; m < strA.length; m++) {
            print(strA[m]);
        }

        for (String is: strA) {
            print(is);
        }

        if (str.contains("Чувак")) {
            print("Отлично!");
        }
        else {
            print("Плохо...");
        }

        print("+-+".repeat(12));
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
