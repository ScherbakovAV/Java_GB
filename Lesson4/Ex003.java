package Lesson_04;

import java.util.*;
// линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах
public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(2); deque.addLast(3);
        System.out.println(deque);
        deque.addFirst(1); deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst(); deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(5); deque.offerLast(6);
        System.out.println(deque);
        deque.pollFirst(); deque.pollLast();
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.pollFirst(); deque.pollLast();
        System.out.println(deque.peekFirst());
    }
}