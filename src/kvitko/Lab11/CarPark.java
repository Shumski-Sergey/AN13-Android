package kvitko.Lab11;

public class CarPark {
    public String CarMark;
    public boolean IsFree;
    public int ParkNumber;


    public CarPark(String CarMark, boolean IsFree,int ParkNumber) {
        this.setCarMark(CarMark);
        this.setIsFree(IsFree);
        this.setParkNumber(ParkNumber);
    }

    public void setCarMark(String CarMark) {
        this.CarMark =CarMark ;
    }

    public void setIsFree(boolean free) {
        this.IsFree = free;
    }

    public void setParkNumber(int ParkNumber) {
        this.ParkNumber = ParkNumber;
    }

    public String getCarMark() {
        return CarMark;
    }

    public int getParkNumber() {
        return ParkNumber;
    }

    public boolean getIsFree() {
        return IsFree;
    }
}
