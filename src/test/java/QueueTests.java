import org.junit.Assert;
import org.junit.Test;

import javax.management.QueryEval;

public class QueueTests {
    @Test
    public void addElementTest() {
        Queue<Integer> queue = new Queue<>();
        queue.put(1);
        Integer expected = 1;
        Assert.assertEquals(expected,queue.getFirst());
    }

    @Test
    public void removeElementTest() {
        Queue<Integer> queue = new Queue<>();
        queue.put(1);
        queue.put(2);

        queue.remove();
        Integer expected = 2;

        Assert.assertEquals(1,queue.size());
        Assert.assertEquals(expected,queue.getFirst());
    }

    @Test
    public void toStringEmptyQueueTest() {
        Queue<Integer> queue = new Queue<>();
        String expected = "[]";
        Assert.assertEquals(expected,queue.toString());
    }

    @Test
    public void toStringWithElementTest() {
        Queue<Integer> queue = new Queue<>();
        queue.put(1);
        queue.put(2);

        String expected = "[1 2 ]";

        Assert.assertEquals(expected,queue.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeElementExceptionTest() {
        Queue<Integer> queue = new Queue<>();
        queue.remove();
    }

    @Test
    public void getFirstElementTest() {
        Queue<Integer> queue = new Queue<>();
        queue.put(1);
        queue.put(2);

        Integer expected = 1;

        Assert.assertEquals(expected,queue.getFirst());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFirstElementExceptionTest() {
        Queue<Integer> queue = new Queue<>();
        queue.getFirst();
    }
}
