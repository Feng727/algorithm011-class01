package pack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        /*deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);
        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);
        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);
        */

        deque.addFirst("a");  // addFirst(e)
        System.out.println(deque);
        deque.addLast("b");  // addLast(e)
        System.out.println(deque);
        deque.offerFirst("c"); //offerFirst(e)
        System.out.println(deque);
        deque.offerLast("d"); // offerLast(e)
        System.out.println(deque);

        String p1 = deque.getFirst(); // getFirst()
        System.out.println(p1);
        String p2 = deque.getLast();  // getLast()
        System.out.println(p2);
        String p3 = deque.peekFirst(); // peekFirst()
        System.out.println(p3);
        String p4 = deque.peekLast(); // peekLast()
        System.out.println(p4);

        deque.removeFirst();  // removeFirst()
        System.out.println(deque);
        deque.removeLast();  // removeLast()
        System.out.println(deque);
        deque.pollFirst();   // pollFirst()
        System.out.println(deque);
        deque.pollLast();   // pollLast()
        System.out.println(deque);

    }
}
