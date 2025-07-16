package introToOOP;

public class Client
{
    public static void main(String[] args) {
        Student student1 = new Student();
//        student1.id = 1;
//        student1.name = "John Doe";
//        student1.age = 21;
////        student1.salary = 7000; // Inaccessible private member
//        student1.setSalary(5000);

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Jane Doe";
        student2.age = 22;


        System.out.println(student1.name);
    }
}
