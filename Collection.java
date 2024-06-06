import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Seema");
        list.add("Aggarwal");
        list.add("Jind");
        
        System.out.println("List: " + list);
        
        // Set example
        Set<String> set = new HashSet<>(list);
        set.add("Date");
        
        System.out.println("Set: " + set);
        
        // Map example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        System.out.println("Map: " + map);
        
        // Queue example
        Queue<String> queue = new LinkedList<>(list);
        queue.offer("Date");
        
        System.out.println("Queue: " + queue);
        
        // Deque example
        Deque<String> deque = new ArrayDeque<>(list);
        deque.addFirst("Elderberry");
        
        System.out.println("Deque: " + deque);
    }
}
