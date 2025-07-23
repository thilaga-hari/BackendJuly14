package interfaces;

public class RandomClass2 implements RandomInterface, RandomeInterface2
{

    @Override
    public void randomMethod() {

    }

    @Override
    public void push(int x) {

    }

    @Override
    public void pop() {

    }

    @Override
    public int top() {
        return 0;
    }

    @Override
    public int size() {
        return RandomInterface.super.size();
    }
}
