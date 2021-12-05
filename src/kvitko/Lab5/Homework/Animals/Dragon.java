package kvitko.Lab5.Homework.Animals;
//Рядом с мышью — и гусь велик, но вот рядом с драконом...
// В этой задаче у нас будут гуси (класс Goose) и драконы (класс Dragon).
// А также их предки, классы BigAnimal или SmallAnimal, кто чей предок — догадайтесь сами.
// Затем переопределите для Goose и Dragon метод String getSize(), так, чтобы они выводили строки о размере животного.

public class Dragon extends BigAnimal{

    public Dragon(String animal, String size) {
        super(animal, size);
    }

}
