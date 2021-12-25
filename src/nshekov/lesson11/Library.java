package nshekov.lesson11;

public class Library {
    public static void main(String[] args) {
        BookToHome WAP = new BookToHome("Война и Мир");
        BookToHome FAC = new BookToHome("Отцы и дети");
        BookToHome IDIOT = new BookToHome("Идиот");
        BookToLibrary ENCY_M = new BookToLibrary("Энциклопеция о людях");
        BookToLibrary ENCY_A = new BookToLibrary("Энциклопеция о природе");
        Person vadim = new Person("Вадим", WAP, ENCY_M);
        Person artem = new Person("Артём", WAP);
        Person ira = new Person("Ира", FAC, ENCY_A);
        Person ira1 = new Person("Ira", IDIOT);
        Person vadim1 = new Person("Vadim", IDIOT);
        Person nikita = new Person("Никита", ENCY_M);
        Person den = new Person("Денис", ENCY_A);

        vadim.start();
        artem.start();
        ira.start();
        ira1.start();
        vadim1.start();
        nikita.start();
        den.start();
    }
}
