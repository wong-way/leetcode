package solution;


public class LRUCache {
    private int capacity;
    private int currentSize;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = head;
        currentSize = 0;
    }

    public int get(int key) {
        Node stepper = head;
        Node curr = null;
        while (stepper.next != null) {
            if (stepper.next.key == key) {
                curr = stepper.next;
                stepper.next = stepper.next.next;

            } else {
                stepper = stepper.next;
            }

        }
        if (curr == null) {
            return -1;
        } else {
            stepper.next = curr;
            tail = curr;
            tail.next = null;
            return curr.value;
        }


    }

    public void put(int key, int value) {
        if (get(key) != -1) {
            Node newNode = new Node(key, value);
            currentSize++;
            tail.next = newNode;
            tail = tail.next;
            if (currentSize > capacity) {
                //将头指针后移
                head = head.next;
            }
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.key == key) {
                    temp.value = value;
                }
                temp = temp.next;
            }
        }

    }

    private class Node {
        public int key;
        public int value;
        public Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(1);
        cache.put(2, 1);

        cache.get(2);
        cache.put(3, 2);
        cache.get(2);
        cache.get(3);

    }
}
