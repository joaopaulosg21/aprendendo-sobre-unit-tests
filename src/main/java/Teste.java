public class Teste {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.remove();
        System.out.println(queue.getFirst());
    }
}
