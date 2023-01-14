package pro.sky.java.course1.lesson13;

public class Main {
    public static void main(String[] args) {

        Author nikolaGogogl = new Author("Николай", "Гоголь");
        Book tarasBulba = new Book("Тарас Бульба", nikolaGogogl, 1835);
        System.out.println(("Название книги: " + tarasBulba.getName()));
        System.out.println(("Год издания: " + tarasBulba.getAge()));
        System.out.println(("Автор: " + tarasBulba.getAuthor().getFullName()));
        System.out.println();

        Author mihailLermontov = new Author("Михаил", "Лермонтов");
        Book heroOfOurTime = new Book("Герой нашего времени", mihailLermontov, 1838);
        System.out.println(("Название книги: " + heroOfOurTime.getName()));
        System.out.println(("Год издания: " + heroOfOurTime.getAge()));
        System.out.println(("Автор: " + heroOfOurTime.getAuthor().getFullName()));

        heroOfOurTime.setAge(1900);
        System.out.println(("Новый год издательства книги: " + heroOfOurTime.getAge()));
        System.out.println();

        // Для задачи 2. Использую toString, чтобы вывести сообщения :

        System.out.println(new Book("Тарас Будьба", nikolaGogogl, 1835));
        System.out.println(new Book("Герой нашего времени", mihailLermontov, 1838));

        // сравниваю два объекта.
        Author nikolaGogogl2 = new Author("Николай", "Гоголь");
        System.out.println(nikolaGogogl2.equals(nikolaGogogl));
        System.out.println(mihailLermontov.equals(nikolaGogogl));
        System.out.println();

        Book tarasBulba2 = new Book("Тарас Бульба", nikolaGogogl, 1835);
        System.out.println(tarasBulba2.equals(tarasBulba));
        System.out.println(heroOfOurTime.equals(tarasBulba));
    }

}
