package pro.sky.java.course1.lesson13;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public String getFullName() {
        String FullName = (this.firstName + " " +this.lastName);
        return FullName;
    }
}
