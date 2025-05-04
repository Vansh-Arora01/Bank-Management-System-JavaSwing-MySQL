public class Company {
    public static void main(String[] args) {
        // Demonstrating Person class
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob", 25);

        p1.display(); // Name: Alice, Age: 18
        p2.display(); // Name: Bob, Age: 25

        // Demonstrating Employee class
        Employee e1 = new Employee(50000);
        Employee e2 = new Employee(60000);
        Employee e3 = new Employee(70000);

        e1.display();
        e2.display();
        e3.display();

        // Display total employees and total salary
        Employee.stats();
    }
}
