package aalekseenko.Lection3;

public class OdnomMassTask1 {
    public static void main(String[] args) {
int counter = 0;
int start = 2;
int end = 20;
for(int i = start; i <= end; i+=2){
    counter++;
}
int[] mass = new int[counter];
mass[0] = 2;
System.out.print(mass[0]+" ");
for (int i = 1; i < counter; i++){
    mass[i] = mass[i-1]+2;
    System.out.print(mass[i]+" ");
    }
System.out.println();
for (int i = 0; i < counter; i++){
    System.out.print(mass[i]+"\n");
        }
}}
