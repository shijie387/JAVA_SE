public class TestLibraryBook {
//    （2）声明一个`TestLibraryBook`类，创建`LibraryBook`图书对象，打印图书详细信息，并尝试调用借书与还书的方法。
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("xwz","ash", "hsg567", true);

        System.out.println(b.borrowBook());
        System.out.println(b.borrowBook());
        b.returnBook();
        System.out.println(b.borrowBook());
    }
}
