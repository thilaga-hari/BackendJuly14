package introToMultiThreading;

public class Client
{
    public static void main(String[] args)
    {
        System.out.println("Current thread: " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//       helloWorldPrinter.print();
         for (int i = 1; i <= 100; i++) {
             Thread thread = new Thread(helloWorldPrinter);
             thread.start();
        }
    }
}
