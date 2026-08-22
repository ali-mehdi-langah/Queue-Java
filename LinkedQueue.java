public class LinkedQueue implements Queue{
    static class Node {
        Object data;
        Node next;
        Node prev = this.next = this;

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
        private int size;
        Node head = new Node(null);
        public int size(){
            return size;
        }
        public void add(Object obj){
            ++size;
            head.prev.next = new Node(obj, head.prev, head);
            head.prev = head.prev.next;
        }
        public Object first(){
            if (size == 0) throw new IllegalStateException("Queue is empty");
            return head.next.data;
        }
        public Object remove(){
            --size;
            Object temp = head.next.data;
            head.next = head.next.next;
            head.next.prev = head;
            return temp;
    }
       public String toString(){
            if(size == 0){
                return "Queue is empty";
            }
            StringBuffer bf = new StringBuffer();
            for(Node i = head.next; i.data != null; i = i.next ){
                bf.append(i.data).append(" ");
            }
       return bf+" ";
        }
    public int sum(){
        LinkedQueue.Node temp = head.next;
        int total = 0;
        while (temp.data != null){
            total += (Integer) temp.data;
            temp = temp.next;
        }
        return total;
    }
    void main() {
        LinkedQueue linkedQueue = new LinkedQueue();

        linkedQueue.add(4);
        linkedQueue.add(5);
        linkedQueue.add(2);
        System.out.println(linkedQueue.size());
        System.out.println("First element: " + linkedQueue.first());
        System.out.println("Removed element: "+ linkedQueue.remove());
        System.out.println(linkedQueue.toString());
    }
}



