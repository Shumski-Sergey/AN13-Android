package aalekseenko.Lection3;

public class OdnomMassTask2 {
    public static void main(String[] args) {
int counter = 0;
int start = 1;
int end = 99;
for(int i = start; i <= end; i+=2){
    counter++;
}
int[] mass = new int[counter];
mass[0] = 1;
System.out.print(mass[0]+" ");
for (int i = 1; i < counter; i++){
    mass[i] = mass[i-1]+2;
    System.out.print(mass[i]+" ");
}
        System.out.println();
        for (int i = (counter-1); i >=0; i--){
            System.out.print(mass[i]+" ");
        }
}
}
