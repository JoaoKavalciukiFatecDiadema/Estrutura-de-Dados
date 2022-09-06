public class App {
    public static void main(String[] args) throws Exception {
       Stack stack = new Stack(5);

        stack.push(5);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
