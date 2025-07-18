package inheritance;

public class Dog extends Mammal
{
    private String breed;

    void makeSound()
    {
        System.out.println("Dog is barking");
    }

    void setName()
    {
        setName("Bruce");
    }
}
