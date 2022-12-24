public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Антон", "Чехов");
        System.out.println(author1);
        System.out.println(author2);
        Book book1 = new Book("Собачье сердце", author1, 1925);
        Book book2 = new Book("Пари", author2, 1889);
        System.out.println(book1);
        System.out.println(book2);

    }
}