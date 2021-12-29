package nshekov.lesson11.CallCenter;

public class Operator{
    private String numberOperator;
    private boolean is_free;

    public Operator(String numberOperator, boolean is_free) {
        this.numberOperator = numberOperator;
        this.is_free = is_free;
    }

    public String getNumberOperator() {
        return numberOperator;
    }

    public void setIs_free(boolean is_free) {
        this.is_free = is_free;
    }

    public boolean isIs_free() {
        return is_free;
    }

}
