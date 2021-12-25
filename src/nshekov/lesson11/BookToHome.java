package nshekov.lesson11;

public class BookToHome extends Thread{
    private final String bookName;
    private boolean flag = true;

    public BookToHome(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public synchronized void getBook(String personName){
        while (!flag){
            try {
                System.out.println(bookName + " пока у кого-то дома");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(personName + " взял(а) " + bookName);
        flag = false;
    }
    public synchronized void putBook(String personName){
        System.out.println(personName + " вернул(а) в библиотеку " + bookName);
        flag = true;
        notify();
    }

}
