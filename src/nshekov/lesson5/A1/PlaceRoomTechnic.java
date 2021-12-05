package nshekov.lesson5.A1;

class PlaceRoomTechnic extends RoomTechnic {

    String place;

    public PlaceRoomTechnic(String name, String model, int age, String room, String place) {
        super(name, model, age, room);
        this.place = place;
    }

    @Override
    public void inTheSocket() {
        super.inTheSocket();
        System.out.println("На ".concat(place));
    }
}
