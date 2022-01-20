package kvitko.Lab11.BusStop;
//Автобусные остановки. На маршруте несколько остановок.
//На одной остановке может останавливаться несколько автобусов одновременно, но не более заданного числа.

public class Bus {
    public int Bus_Number;
    public int Bus_Stop_Number;
    public int Free_Places;
    public boolean IsFree;

    public Bus(int Bus_Number, int Bus_Stop_Number, int Free_Places, boolean IsFree) {
        this.setBus_Number(Bus_Number);
        this.setBus_Stop_Number(Bus_Stop_Number);
        this.setFree_Places(Free_Places);
        this.setIsFree(IsFree);
    }

    public void setBus_Number(int Bus_Number) {
        this.Bus_Number = Bus_Number;
    }

    public void setBus_Stop_Number(int Bus_Stop_Number) {
        this.Bus_Stop_Number = Bus_Stop_Number;
    }

    public void setFree_Places(int Free_Places) {
        this.Free_Places = Free_Places;
    }

    public void setIsFree(boolean IsFree) {
        this.IsFree = IsFree;
    }

    public int getBus_Number() {
        return Bus_Number;
    }

    public int getBus_Stop_Number() {
        return Bus_Stop_Number;
    }

    public int getFree_Places() {
        return Free_Places;
    }

    public boolean getIsFree() {
        return IsFree;
    }
}
