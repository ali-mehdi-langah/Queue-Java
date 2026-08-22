public interface Queue {
    int size();
    Object first();
    void add(Object obj);
    Object remove();
}
