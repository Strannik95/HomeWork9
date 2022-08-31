public class Main {


    public static void main(String[] args) {
        Book book = new Book("война и Мир", new Author("Лев", "Толстой"), 1869);
        System.out.println("book = " + book.getName());
        System.out.println("book = " + book.getAuthor().getName());
        System.out.println("book = " + book.getAuthor().getSurname());
        System.out.println("book = " + book.getYear());

        Book book1 = new Book("Герой нашего времени", new Author("Адександр", "Грибоедов"), 1824);
        System.out.println("book1 = " + book1.getName());
        System.out.println("book1 = " + book1.getAuthor().getName());
        System.out.println("book1 = " + book1.getAuthor().getSurname());
        System.out.println("book1 = " + book1.getYear());
        book1.setYear(1922);
        System.out.println("book1.getYear() = " + book1.getYear());
        System.out.println(book);
        System.out.println(book1);

    }
}
