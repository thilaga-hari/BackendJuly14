package inheritance;

public class Animal
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public void eat()
    {
        System.out.println(this.name + " is eating...");
    }
}
