package Lesson_04;

import java.util.*;

// Обработка данных по принципу LIFO. Расширяет Vector пятью
// операциями, которые позволяют рассматривать Vector как Stack.
// Stack и Vector не рекомендованы к использованию.
public class Ex004 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.addElement(123);
        System.out.println(stack);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
        System.out.println(stack);
    }
}
