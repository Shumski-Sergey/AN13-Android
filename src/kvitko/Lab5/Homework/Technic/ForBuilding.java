package kvitko.Lab5.Homework.Technic;

public class ForBuilding extends Technic {
    String ForWhat;

    public ForBuilding(String TypeOfItem, String ForWhat) {
        super(TypeOfItem);
        this.ForWhat = ForWhat;
    }

    public String getForWhat() {
        return ForWhat;
    }
}
