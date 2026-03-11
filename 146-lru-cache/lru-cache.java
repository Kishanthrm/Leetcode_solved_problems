class LRUCache {
    class Node{
        int key, value;
        Node next, prev;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    Node head = null;
    Node tail = null;
    int capacity;
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        delete(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node rem = map.get(key);
            delete(rem);
            map.remove(key);
        }
        if(map.size() == capacity){
            Node rem = tail.prev;
            delete(rem);
            map.remove(rem.key);
        }
        Node newNode = new Node(key,value);
        add(newNode);
        map.put(key,newNode);
    }

    public void delete(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void add(Node node){
        node.prev = head;
        node.next = head.next;
        head.next = node;
        node.next.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */