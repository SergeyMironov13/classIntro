public class Main {
    public static void main(String[] args) {
        
        Book book = new Book("Евгений Онегин", 1833,
                new Author("Александр", "Пушкин", 1),
                224);

        System.out.println(book.isBig());
        System.out.println(book.matches("Александр"));
        System.out.println(book.estimatePrice());
    }

}
