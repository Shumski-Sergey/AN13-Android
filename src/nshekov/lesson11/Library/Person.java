package nshekov.lesson11.Library;

public class Person extends Thread{
    private final String personName;
    private BookToHome bookToHome;
    private BookToLibrary bookToLibrary;

    public Person(String personName, BookToHome b) {
        new Thread(b).start();
        this.personName = personName;
        this.bookToHome = b;
    }

    public Person(String personName, BookToHome b, BookToLibrary a) {
        new Thread(b).start();
        this.personName = personName;
        this.bookToHome = b;
        this.bookToLibrary = a;
    }

    public Person(String personName, BookToLibrary b) {
        new Thread(b).start();
        this.personName = personName;
        this.bookToLibrary = b;
    }

    public void run() {
        if (bookToHome != null) {
            System.out.println(personName + " хочет взять книгу " + bookToHome.getBookName() + " домой");
            bookToHome.getBook(personName);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bookToHome.putBook(personName);
        }
        if (bookToLibrary != null){
            System.out.println(personName + " хочет взять книгу " + bookToLibrary.getBookName() + " почитать в библиотеке");
            bookToLibrary.getBook(personName);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bookToLibrary.putBook(personName);
        }
    }

}
