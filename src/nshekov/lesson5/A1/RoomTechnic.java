package nshekov.lesson5.A1;

class RoomTechnic extends Technic {

    String room;

    RoomTechnic(String name, String model, int age, String room) {
        super(name, model, age);
        this.room = room;
    }

    @Override
    public void inTheSocket() {
        super.inTheSocket();
        System.out.println("В комнате: ".concat(this.room));
    }
}
