/*
1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3* Напишите программу, чтобы перевернуть строку с помощью рекурсии.
4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6* Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7** Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.*/
public class Homework2 {
    public static void main(String[] args) {
        String word = "иллюзионист";
        findInStr(word, "юзио");
        findInStr(word, "лио");
        isReverse(word, "тсиноизюлли");
        isReverse(word, "тсизюлли");
        System.out.printf("(3) %s -> %s\n", word, reverseStr(word));
        createStrSolutionsFromInts(50, 15);
        StrVSStrbuilderTimes();
    }
    private static void findInStr(String str1, String str2) { // Ex. 1
        if (str1.contains(str2)) System.out.printf("(1) В строке \"%s\" содержится \"%s\"\n", str1, str2);
        else System.out.printf("(1) В строке \"%s\" НЕ содержится \"%s\"\n", str1, str2);
    }
    private static void isReverse(String str1, String str2) { // Ex. 2
        if (str1.matches(new StringBuilder(str2).reverse().toString())) System.out.printf("(2) Cтроки \"%s\" и \"%s\" являются вращением друг друга\n", str1, str2);
        else System.out.printf("(2) Cтроки \"%s\" и \"%s\" НЕ являются вращением друг друга\n", str1, str2);
    }
    private static String reverseStr(String str) { //Ex. 3
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }
    private static void createStrSolutionsFromInts(int num1, int num2) { // Ex. 4, 5, 6
        StringBuilder str1 = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        System.out.println("(4) " + str1);
        StringBuilder str2 = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        System.out.println("(4) " + str2);
        StringBuilder str3 = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        System.out.println("(4) " + str3);
        int equalIndex = str2.indexOf("=");
        str2.deleteCharAt(equalIndex).insert(equalIndex, "равно");
        System.out.println("(5) " + str2);
        System.out.println("(6) " + str3.replace(str3.indexOf("="), str3.indexOf("=") + 1, "равно"));
    }
    private static void StrVSStrbuilderTimes() { // Ex. 7
        String str = "=".repeat(10000);
        double begin = System.currentTimeMillis();
        str.replaceAll("=", "равно");
        System.out.println("(7) Время выполнения замены в строке \"=\" на \"равно\" средствами String: " + (System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("=".repeat(10000));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '=') {
                sb.deleteCharAt(i);
                sb.insert(i, "равно");
            }
        }
        System.out.println("(7) Время выполнения замены в строке \"=\" на \"равно\" средствами StringBuilder: " + (System.currentTimeMillis() - begin));
    }
}
