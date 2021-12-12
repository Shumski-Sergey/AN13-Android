package kvitko.Lab6_7.Robot.IHead;

public class Samsung_head  {
    int price;
    String head, action;

    public Samsung_head(String head, String action, int price) {
        this.head = head;
        this.price = price;
        this.action=action;
    }

    public String getHead() {
        return head;
    }

    public int getPrice() {
        return price;
    }

    public String getAction() {
        return action;
    }
}
