package Collections_Exp;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue_LinkeList_Example {

    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<String> lang = new LinkedList<>();

        // ✅ Insert elements using Deque-specific methods
        lang.addLast("Python");      // Queue-style: add at tail
        lang.offerLast("Java");
        lang.addLast("C");
        lang.offerLast("C++");
        lang.addLast("JavaScript");
        lang.offerLast("Rust");
        lang.addLast("Go");

        System.out.println("Deque after addLast() / offerLast(): " + lang);

        // ✅ Insert at front (stack-style or prepending)
        lang.addFirst("Scala");
        lang.offerFirst("Swift");

        System.out.println("Deque after addFirst() / offerFirst(): " + lang);

        // ✅ Accessing head and tail elements
        System.out.println("getFirst() (head): " + lang.getFirst());     // throws exception if empty
        System.out.println("peekFirst() (head): " + lang.peekFirst());   // returns null if empty

        System.out.println("getLast() (tail): " + lang.getLast());
        System.out.println("peekLast() (tail): " + lang.peekLast());

        // ✅ Remove head and tail
        System.out.println("removeFirst(): " + lang.removeFirst());
        System.out.println("pollFirst(): " + lang.pollFirst());

        System.out.println("removeLast(): " + lang.removeLast());
        System.out.println("pollLast(): " + lang.pollLast());

        System.out.println("Deque after removing from both ends: " + lang);

        // ✅ Simulate queue (FIFO): offerLast() + pollFirst()
        lang.offerLast("Kotlin");
        lang.offerLast("TypeScript");
        System.out.println("Queue-mode Deque: " + lang);
        System.out.println("Queue pollFirst(): " + lang.pollFirst());

        // ✅ Simulate stack (LIFO): push() + pop()
        lang.push("Ruby");  // addFirst()
        lang.push("Perl");
        System.out.println("Stack-mode Deque: " + lang);
        System.out.println("Stack pop(): " + lang.pop());  // removeFirst()

        // ✅ Final state
        System.out.println("Final Deque: " + lang);
        System.out.println("Size of deque: " + lang.size());
    }
}
