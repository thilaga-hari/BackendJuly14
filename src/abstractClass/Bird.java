package abstractClass;

public abstract class Bird
{
    String name;

    public Bird()
    {
        System.out.println("Bird created");
    }

    public void fly()
    {
        System.out.println("Bird fly");
    }

    public abstract void eat();
}

/*
* 1. Should not create an object for abstract class
* 2. abstract methods should not have definitions
* 3. Child classes should define the abstract methods in parent classes
* */
