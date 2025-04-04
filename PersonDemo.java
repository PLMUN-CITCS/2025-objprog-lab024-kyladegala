class Person {
    // Attributes
    String name;
    int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's information
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person(); // Default constructor

        // Displaying the information of the persons
        person1.displayPerson();
        person2.displayPerson();
    }
}
