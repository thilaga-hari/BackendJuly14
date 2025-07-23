package interfaces;

public class Client
{
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        stack.push(10);

        stack = new LinkedListStack();
        stack.push(20);

        stack = new QueueStack();
        stack.push(30);

        System.out.println(stack.size());
    }
}
