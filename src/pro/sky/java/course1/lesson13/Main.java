package pro.sky.java.course1.lesson13;

public class Main {
    public static void main(String[] args) {
        Book TarasBulba = new Book("Тарас Бульба", 1835);
        System.out.println(("Название книги: " + TarasBulba.getName()));
        System.out.println(("Год издания: " + TarasBulba.getAge()));
        Author NikolaGogogl = new Author("Николай", "Гоголь");
        System.out.println(("Автор: " + NikolaGogogl.getFirstName() + " " + NikolaGogogl.getLastName()));
        System.out.println();

        Book HeroOfOurTime = new Book("Герой нашего времени", 1838);
        System.out.println(("Название книги: " + HeroOfOurTime.getName()));
        System.out.println(("Год издания: " + HeroOfOurTime.getAge()));
        Author MihailLermontov = new Author("Михаил", "Лермонтов");
        System.out.println(("Автор: " + MihailLermontov.getFirstName() + " " + MihailLermontov.getLastName()));
        HeroOfOurTime.setAge(1900);
        System.out.println(("Новый год издательства книги: " + HeroOfOurTime.getAge()));
    }
}
