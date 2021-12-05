package kvitko.Lab5.Homework.Animals;
//Рядом с мышью — и гусь велик, но вот рядом с драконом...
// В этой задаче у нас будут гуси (класс Goose) и драконы (класс Dragon).
// А также их предки, классы BigAnimal или SmallAnimal, кто чей предок — догадайтесь сами.
// Затем переопределите для Goose и Dragon метод String getSize(), так, чтобы они выводили строки о размере животного.

public class BigAnimal {
    String animal;
    String size;

    public BigAnimal(String animal, String size){
        this.animal=animal;
        this.size=size;
    }

    public String getAnimal() {
        return animal;
    }

    public String getSize() {
        return size;
    }
}
