package jaindsa.collectionsandlang;

import java.util.ArrayDeque;

public class QueueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        que.add(1);
        que.add(2);
        que.add(3);
        System.out.println("jaindsa.collectionsandlang.Queue : " + que);
        System.out.println("jaindsa.collectionsandlang.Queue size : " + que.size());
        System.out.println("jaindsa.collectionsandlang.Queue peek : " + que.peek());
        System.out.println("jaindsa.collectionsandlang.Queue remove : " + que.remove());
        System.out.println("jaindsa.collectionsandlang.Queue isEmpty : " + que.isEmpty());
    }
}
/* 
jaindsa.collectionsandlang.Queue : [1, 2, 3]
jaindsa.collectionsandlang.Queue size : 3
jaindsa.collectionsandlang.Queue peek : 1
jaindsa.collectionsandlang.Queue remove : 1
jaindsa.collectionsandlang.Queue isEmpty : false
*/