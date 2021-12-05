package kvitko.Lab5.Homework.Technic;

public class Run {
    public static void main(String[] args) {
        Stove Stove = new Stove("Technic", "Cooking", "Stove", "on");
        Microwave Microwave = new Microwave("Technic", "Cooking", "Microwave", "on");
        Drill Drill = new Drill("Technic", "Building", "Drill", "on");
        WeldingMachine WeldingMachine = new WeldingMachine("Technic", "Building", "Welding Machine", "on");
        System.out.println("Type of item: "+Stove.getTypeOfItem()+" For what: "+Stove.getForWhat()+" item: "+Stove.getItem()+" socket: "+Stove.getSocket());
        System.out.println("Type of item: "+Microwave.getTypeOfItem()+" For what: "+Microwave.getForWhat()+" item: "+Microwave.getItem()+" socket: "+Microwave.getSocket());
        System.out.println("Type of item: "+Drill.getTypeOfItem()+" For what: "+Drill.getForWhat()+" item: "+Drill.getItem()+" socket: "+Drill.getSocket());
        System.out.println("Type of item: "+WeldingMachine.getTypeOfItem()+" For what: "+WeldingMachine.getForWhat()+" item: "+WeldingMachine.getItem()+" socket: "+WeldingMachine.getSocket());
    }
}
