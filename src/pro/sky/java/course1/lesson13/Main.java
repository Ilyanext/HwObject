package pro.sky.java.course1.lesson13;

public class Main {
    public static void main(String[] args) {

        Author NikolaGogogl = new Author("Николай", "Гоголь");
        Book TarasBulba = new Book("Тарас Бульба", NikolaGogogl, 1835);
        System.out.println(("Название книги: " + TarasBulba.getName()));
        System.out.println(("Год издания: " + TarasBulba.getAge()));
        System.out.println(("Автор: " + TarasBulba.getAuthor().getFullName()));
        System.out.println();

        Author MihailLermontov = new Author("Михаил", "Лермонтов");
        Book HeroOfOurTime = new Book("Герой нашего времени", MihailLermontov, 1838);
        System.out.println(("Название книги: " + HeroOfOurTime.getName()));
        System.out.println(("Год издания: " + HeroOfOurTime.getAge()));
        System.out.println(("Автор: " + HeroOfOurTime.getAuthor().getFullName()));

        HeroOfOurTime.setAge(1900);
        System.out.println(("Новый год издательства книги: " + HeroOfOurTime.getAge()));
    }
}
