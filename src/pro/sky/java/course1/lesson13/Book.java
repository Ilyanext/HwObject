package pro.sky.java.course1.lesson13;

public class Book {
    private String name;
    private int age;
    private Author author;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //для задачи2
    @Override
    public String toString() {
        return name + " " + author + " " + age;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if (this.getClass() == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Book c2 = (Book) other;
        return name.equals(c2.name) && author.equals(c2.author);
    }

    public int hasCode() {
        return java.util.Objects.hash(name, author, age);
    }
}
