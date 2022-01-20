package nshekov.lesson11.Library;

public class BookToLibrary extends Thread{
    private final String bookName;
    private boolean flag = true;

    public BookToLibrary(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public synchronized void getBook(String personName){
        while (!flag){
            try {
                System.out.println(bookName + " пока кто-то читает в библиотеке");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(personName + " взял(а) " + bookName);
        flag = false;
    }
    public synchronized void putBook(String personName){
        System.out.println(personName + " вернул(а) " + bookName);
        flag = true;
        notify();
    }

}
