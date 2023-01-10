package pro.sky.java.course1.lesson13;

public class Author {
   private String FirstName;
   private String LastName;

    public Author(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName() {
        return this.LastName;
    }
}
