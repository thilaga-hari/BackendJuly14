package interfaces;

public interface Stack
{
    void push(int x);
    void pop();
    int top();
    default int size()
    {
        return 7;
    }
}
