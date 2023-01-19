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
        findInStr("Обезьяна", "ян");
        findInStr("Обезьяна", "кис");
        isReverse("привет", "тевирп");
        isReverse("привет", "тевп");
        createStrSolutionsFromInts(50, 15);
    }
    private static void findInStr(String str1, String str2) { // Ex. 1
        if (str1.contains(str2)) System.out.printf("В данной строке содержится \"%s\"\n", str2);
        else System.out.printf("В данной строке НЕ содержится \"%s\"\n", str2);
    }
    private static void isReverse(String str1, String str2) { // Ex. 2
        if (str1.matches(new StringBuilder(str2).reverse().toString())) System.out.println("Данные строки являются вращением друг друга");
        else System.out.println("Данные строки НЕ являются вращением друг друга");
    }
//    private static String reverseStr(String str) {
//        char[] strReversed = str.toCharArray();
//        int count = str.length() - 1;
//         str.charAt(count);
//        if (count == 0) return strReversed;
//        else {
//            strReversed += reverseStr(str);
//        }
//        return null;
//    }
    private static void createStrSolutionsFromInts(int num1, int num2) { // Ex. 4, 5, 6
        StringBuilder str1 = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        System.out.println(str1);
        StringBuilder str2 = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        System.out.println(str2);
        int equalIndex = str2.indexOf("=");
        str2.deleteCharAt(equalIndex).insert(equalIndex, "равно");
        System.out.println(str2);
        StringBuilder str3 = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        System.out.println(str3);
        System.out.println(str3.replace(str3.indexOf("="), str3.indexOf("=") + 1, "равно"));
    }
}
