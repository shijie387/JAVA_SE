public class LibraryBook {
//    1）设计一个`LibraryBook`类，它应该包含以下私有属性：
//
//            - `title`（书名）
//            - `author`（作者）
//            - `isbn`（ISBN号）
//            - `available`（是否可借阅）
//
//    提供无参和有参构造，便于创建图书对象。
//
//    提供get/set方法，便于修改图书的属性值。
//    提供方法来借书（`borrowBook`）和还书（`returnBook`），同时确保图书的状态正确更新。
//
//    另外，提供一个方法`getDetails()`来返回图书的所有细节。
    private String title;
    private String author;
    private String isbn;
    private static boolean available = true;

    public boolean borrowBook(){
        if (this.available){
            this.available = false;
            return true;
        }else {
            return false;
        }
    }
    public void returnBook(){
        this.available = true;
    }
    public LibraryBook() {
    }

    public LibraryBook(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDetail() {
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
