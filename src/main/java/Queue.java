import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> {

    private final List<T> queue;
    public Queue() {
        queue = new ArrayList<>();
    }

    public void put(T element) {
        queue.add(element);
    }

    public void remove() throws IndexOutOfBoundsException{
        queue.remove(queue.get(0));
    }

    public T getFirst() throws IndexOutOfBoundsException {
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        if(queue.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for(T element:queue) {
            result.append(element.toString()).append(" ");
        }
        result.append("]");
        return result.toString();
    }
}
