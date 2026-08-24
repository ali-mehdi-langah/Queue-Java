public class ExpensiveTracker {
    static class Node {
        Object data;
        Node next = this;
        Node prev =  this;

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
    public int sum(LinkedQueue s){
        Node temp = head.next;
        int total = 0;
        while (temp.data != null){
            total += (Integer) temp.data;
            temp = temp.next;
        }
        return total;
    }    
    public static void main(String[] args){
        LinkedQueue credit = new LinkedQueue();
        LinkedQueue debit = new LinkedQueue();

        credit.add(200);
        credit.add(430);
        credit.add(440);

        debit.add(100);
        debit.add(230);
        debit.add(120);

        System.out.println("Credit: "+ credit.sum());
        System.out.println("Debit: "+ debit.sum());
        System.out.println("Total Balance: "+ (credit.sum() - debit.sum()));
    }
}
