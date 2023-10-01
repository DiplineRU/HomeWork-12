public class Main {
    public void app(){
        Author author = new Author("Петя","Иванов");
        Author author1 = new Author("Алеша","Попович");
        Book book1 = new Book("Война и Мир",author,1111);
        Book book2 = new Book("Алешка",author1,2222);
        book1.setBookYear(333);
        System.out.println(book1);
        System.out.println(book2);
        if(author.equals(author1)){
            System.out.println("Одинаковые авторы");
        }
        // Сравнение Хешей имен автора
        if(author.hashCode() == author1.hashCode()){
            System.out.println("Одинаковые авторы");
        }
        // Сравнение названии книги, автора, года издания
        if(book1.equals(book2)){
            System.out.println("Одинаковые книги");
        }
        // Сравнение Хешей названий книг, так как методы переписаны
        if(book1.hashCode() == book2.hashCode()){
            System.out.println("Одинаковые книги");
        }
    }
}