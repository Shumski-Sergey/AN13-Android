package asemiakin.lab6.task2;

class Goose extends SmallAnimal{
    @Override
    public String getSize(){
        return "Гусь - " + super.getSize();
    }
}
