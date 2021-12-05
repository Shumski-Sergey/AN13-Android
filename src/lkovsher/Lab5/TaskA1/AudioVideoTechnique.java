package lkovsher.Lab5.TaskA1;

public class AudioVideoTechnique extends Appliances{
    int sound;

    public AudioVideoTechnique(String firm, float price, int sound) {
        super(firm, price);
        this.sound = sound;
    }

    public int getSound() {
        return sound;
    }
}
