public class ArrayQueue  implements Queue {
    int size;
    Object a[];

    public ArrayQueue(int capacity){
        a = new Object[capacity];
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public Object first() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return a[0];
    }
    public Object last(){
        if (isEmpty()) throw new IllegalStateException("Queue is empty");

        return a[size-1];
    }
    public void add(Object obj){
        size++;
    if (size == a.length)
        resize();
   // a[size++] = obj;
    a[size-1] = obj;
    }
    public Object remove(){
        Object temp = a[0];
        for(int i = 0; i <size-1; i++) {
            a[i] = a[i + 1];
        }
        a[--size] = null;
        return temp;
    }
    public void resize(){
        Object[] aa = a;
        a = new Object[2 * aa.length];
        System.arraycopy(aa,0,a,0,size);
    }
    public String toString(){
        if (isEmpty()){
            return "ArrayQueue is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++ ){
            sb.append(a[i]).append(" ");
        }
        return sb.toString();
    }
    public boolean Equals(ArrayQueue ak){
        if(this.a == null || ak.a == null){
            return false;
        }
        if(this.size != ak.size){
            return false;
        }
        for(int i = 0; i < size; i++){
            if(!this.a[i].equals(ak.a[i]))
                return false;
        }
        return true;
    }
    static void main() {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.add(5);


        System.out.println(arrayQueue.size());
        System.out.println("ToString After removing element: "+arrayQueue.toString());
        System.out.println("first element: "+arrayQueue.first());
        System.out.println("Last element: "+arrayQueue.last());
        System.out.println("Remove : "+arrayQueue.remove());
        System.out.println("After Remove first element is :"+arrayQueue.first());
        System.out.println("ToString After removing element: "+arrayQueue.toString());
    }
}
