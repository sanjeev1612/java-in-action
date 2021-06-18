package jaindsa.collectionsandlang;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("jaindsa.collectionsandlang.Stack : " + stack);
        System.out.println("jaindsa.collectionsandlang.Stack size : " + stack.size());
        System.out.println("jaindsa.collectionsandlang.Stack pop : " + stack.pop());
       // System.out.println("jaindsa.collectionsandlang.Stack top : " + stack.peek());
        System.out.println("jaindsa.collectionsandlang.Stack isEmpty : " + stack.isEmpty());
    }
}

/* 
jaindsa.collectionsandlang.Stack : [1, 2, 3]
jaindsa.collectionsandlang.Stack size : 3
jaindsa.collectionsandlang.Stack pop : 3
jaindsa.collectionsandlang.Stack top : 2
jaindsa.collectionsandlang.Stack isEmpty : false
*/