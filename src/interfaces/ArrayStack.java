package interfaces;

public class ArrayStack implements Stack
{
    public void push(int x)
    {
        System.out.println("Push from ArrayStack");
    }
    public void pop(){}
    public int top(){ return 0; }
}
