package interfaces;

public class QueueStack implements Stack {
    @Override
    public void push(int x) {
        System.out.println("Push from QueueStack");
    }

    @Override
    public void pop() {

    }

    @Override
    public int top() {
        return 0;
    }
}
