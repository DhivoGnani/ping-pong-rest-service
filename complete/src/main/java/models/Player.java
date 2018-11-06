package models;

public class Player {

    private final long id;
    private final String firstName;
    private final String lastName;
    private int age;
    // TODO: Add gender field (use ENUM)

    public Player(long id, String firstName, String lastName, int age)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
