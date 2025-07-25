package introToMultiThreading;

public class HelloWorldPrinter implements Runnable
{
    public static int id = 0;
    public void print()
    {
        System.out.println("Number" + id++
                "is printed from thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}
