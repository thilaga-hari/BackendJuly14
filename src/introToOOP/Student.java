package introToOOP;

public class Student
{
    // Data members
    int id;
    public String name;
    protected int age;
    private int salary;

//    //Default constructor
//    public Student()
//    {
//        id = 0;
//        name = "New Student";
//        age = 21;
//        salary = 50000;
//    }

    //Parameterized Constructor
//    public Student(String newName, int newAge)
//    {
//        name = newName;
//        age = newAge;
//    }
//
//    public Student(String newNamel, int newAge, int newSalary)
//    {
//
//    }


    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int newSalary)
    {
        if(newSalary < 500)
        {
            System.out.println("Salary is too low");
            return;
        }
        salary = newSalary;
    }

    void addAttendClass()
    {
        System.out.println(name + " is attending the class with salary " + salary);
    }
}

/*
* private - Only class access
* default - Inside Package access
* protected - Outside package + child member
* public - access everywhere
* */
