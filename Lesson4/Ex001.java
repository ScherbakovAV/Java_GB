package Lesson_04;

import java.util.LinkedList;

// Связный список. Нужен для небольшого количества элементов, в которых операции добавления/удаления встречаются чаще операций чтения.
public class Ex001 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
    }
}
