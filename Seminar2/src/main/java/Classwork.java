// Напишите программу, чтобы найти вхождение в строке
// (содержащей все символы другой строки).
// Напишите программу, чтобы проверить, являются ли две данные строки
// вращением друг друга (вхождение в обратном порядке).
// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// Дано два числа, например 3 и 56, необходимо составить следующие строки
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// Замените символ “=” на слово “равно”. Используйте методы
// StringBuilder.insert(),StringBuilder.deleteCharAt().

public class Classwork {
    public static void main(String[] args) {
        findInStr("Обезьяна", "ян");
        findInStr("Обезьяна", "кис");
        isReverse("привет", "тевирп");
        isReverse("привет", "тевп");
    }
    private static void findInStr(String str1, String str2) {
        System.out.println(str1.contains(str2));
    }
    private static void isReverse(String str1, String str2) { // не работает
        str2 = new StringBuilder(str2).reverse().toString();
        System.out.println(str1 + " " + str2);
        if (str1 == str2) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}
