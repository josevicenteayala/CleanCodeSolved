package com.cleancode.datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedListReview {
    public static void main(String[] args) {
        testLinkedListMethods();
        Queue<String> queue = new ArrayBlockingQueue<>(10);

        Stack<String> stringStack = new Stack<>();

    }

    private static void testLinkedListMethods() {
        LinkedList<String> list = getLinkedList();
        System.out.println("get 1: "+list.get(1));
        printLinkedList(list);
        System.out.println("peek: "+list.peek());
        printLinkedList(list);
        System.out.println("peekFirst: "+list.peekFirst());
        printLinkedList(list);
        System.out.println("peekLast: "+list.peekLast());
        printLinkedList(list);
        System.out.println("getFirst: "+list.getFirst());
        printLinkedList(list);
        System.out.println("getLast: "+list.getLast());
        printLinkedList(list);
        System.out.println("poll: "+list.poll());
        printLinkedList(list);
        System.out.println("pollFirst: "+list.pollFirst());
        printLinkedList(list);
        System.out.println("pollLast: "+list.pollLast());
        printLinkedList(list);
        System.out.println("element: "+list.element());
        printLinkedList(list);
        System.out.println("pop: "+list.pop());
        printLinkedList(list);
        System.out.println("remove: "+list.remove());
        printLinkedList(list);
        System.out.println("remove(index): "+list.remove(2));
        printLinkedList(list);
        System.out.println("removeFirst: "+list.removeFirst());
        printLinkedList(list);
        System.out.println("removeLast: "+list.removeLast());
        printLinkedList(list);
    }

    private static LinkedList<String> getLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eighth");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        list.add("twelve");
        list.add("thirteen");
        list.add("fourteen");
        list.add("fifteen");
        list.add("sixteen");
        list.add("seventeen");
        list.add("eighteen");
        list.add("nineteen");
        list.add("twenty");
        return list;
    }

    private static void printLinkedList(LinkedList list){
        System.out.println(list);
    }

}
