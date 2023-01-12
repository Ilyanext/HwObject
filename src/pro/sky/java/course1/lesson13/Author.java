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
        String FullName = (this.firstName + " " + this.lastName);
        return FullName;
    }
    // для задачи 2
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstName.equals(c2.firstName) && lastName.equals(c2.lastName);
    }
    public int hasCode() {
        return java.util.Objects.hash(lastName,firstName);
    }
}
