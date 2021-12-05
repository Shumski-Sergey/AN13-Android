package kvitko.Lab5.Homework.Technic;

public class ForCooking extends Technic {
    String ForWhat;

    public ForCooking(String TypeOfItem, String ForWhat) {
        super(TypeOfItem);
        this.ForWhat = ForWhat;
    }

    public String getForWhat() {
        return ForWhat;
    }
}
