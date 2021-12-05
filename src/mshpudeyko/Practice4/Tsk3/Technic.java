package mshpudeyko.Practice4.Tsk3;

public abstract class Technic {
    int price;
    String name;
    boolean onOFF;

    public Technic(int price, String name, boolean onOFF) {
        this.price = price;
        this.name = name;
        this.onOFF = onOFF;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean getOnOFF() {
        return onOFF;
    }

    public String onOFF(){
        if(getOnOFF()){
            return "YES";
        }
        else return "NO";
    }

    public void print(){
        System.out.print("Price: "+getPrice()+"\tname: "+getName()+"\tconnect with power socket: "+onOFF());
    }
}
