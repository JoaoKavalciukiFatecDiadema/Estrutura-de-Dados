public class App {
    public static void main(String[] args) throws Exception {
        Queue busQueue = new Queue(5);

        busQueue.enqueue("João Kavalciuki");
        busQueue.enqueue("Flavio");
        busQueue.enqueue("José Anderson");
        busQueue.enqueue("Eduardo Martins");
        busQueue.enqueue("Andrea Zotovici");
        System.out.println(busQueue.toString());
        busQueue.dequeue();
        System.out.println(busQueue);
        System.out.println(busQueue.peek());
    }
}
