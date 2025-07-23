package interfaces;

public class LinkedListStack implements Stack
{
    @Override
    public void push(int x)
    {
        System.out.println("Push from LinkedList Stack");
    }

    @Override
    public void pop() {

    }

    @Override
    public int top() {
        return 0;
    }
}
