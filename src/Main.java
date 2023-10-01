public class Main {
    public void app(){
        Author author = new Author("Петя","Иванов");
        Author author1 = new Author("Алеша","Попович");
        Book book1 = new Book("Война и Мир",author,1111);
        Book book2 = new Book("Алешка",author1,2222);
        book1.setBookYear(333);
        System.out.println(book1);
        System.out.println(book2);
    }
}