package epavlyutin.pack5;

public class houseHold {
    private boolean forKitchen;
    private String firm;
    private int door;

   public houseHold(boolean forKitchen, String firm, int door) {
      this.forKitchen = forKitchen;
      this.firm = firm;
      this.door = door;
   }

    public boolean isForKitchen() {
        return forKitchen;
    }

    public String getFirm() {
        return firm;
    }

    public int getDoor() {
        return door;
    }


}


