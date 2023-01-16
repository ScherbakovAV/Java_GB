import java.util.Random;
import java.util.Scanner;

public class From_teacher {

    public static void main(String[] arg) {
//        print("Hello!");
        int i = 0; //32бита целочисленный
        long l = 0; //64бита целочисленный
        byte b = 0;
        short s = 0;
        float f = 0.1f; //32бита дробный
        double d = 0.1; //64бита дробный
        char c = 'f'; //16бит без знаковый
        String str = "Привет! Hello! Ola!"; //Строка
        boolean b1 = true;

        int[] aI = new int[10];

        int[] tmp = new int[aI.length+5];
        aI = tmp;

        Random rnd = new Random();

//        for (int j = 0; j < aI.length; j++) {
//            aI[j] = rnd.nextInt();
//        }

//        for (int j = 0; j < aI.length; j++) {
//            print(String.valueOf(aI[j]));
//        }

//        print(str);
//        print(str.toLowerCase());
//        print(String.valueOf(str.contains("el")));
//        print(str.substring(1, str.length()/2));
//        print(str.replace("Привет", "Пока"));
        String[] strA = str.split(" ");

//        for (String is: strA) {
//            print(is);
//        }

//        for (int j = 0; j < strA.length; j++) {
//            print(strA[j]);
//        }

//        print(Character.getName(str.charAt(str.length()-4)));
//        String s1 = "Привет!";
//        if (str.contains(s1)) {
//            print("Good!");
//        }

//        print(String.valueOf(Integer.toBinaryString(rnd.nextInt(128)).length()));
//        print("Hello!,".repeat(12));

        Scanner scanner = new Scanner(System.in);

        String newString = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        i = scanner1.nextInt();
        newString = scanner.nextLine();
        print(newString);

    }

    private static void print(String str){
        System.out.println(str);
    }
}