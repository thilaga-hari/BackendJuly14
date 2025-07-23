package interfaces;

public interface Stack
{
    int x = 20; // static and final by default => constant

    void push(int x);
    void pop();
    int top();
    default int size()
    {
        return x;
    }
}
