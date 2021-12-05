package nshekov.lesson5.A1;

public class Runner {
    public static void main(String[] args) {
        RoomTechnic comp = new RoomTechnic("Computer", "Lenovo", 2017, "гостинная");
        comp.displayInfo();
        comp.inTheSocket();
        System.out.println();
        PlaceRoomTechnic comp1 = new PlaceRoomTechnic("Компьютер", "Mac", 2019, "спальная", "столе");
        comp1.displayInfo();
        comp1.inTheSocket();
        System.out.println();
        Technic player = new Technic("Плеер", "mp3", 2008);
        player.displayInfo();

    }
}
