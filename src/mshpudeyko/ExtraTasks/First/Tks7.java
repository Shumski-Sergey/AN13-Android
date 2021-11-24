package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class Tks7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of programmers: ");
        int programmers= scanner.nextInt();
        if(programmers==11 || programmers==12 || programmers==13 || programmers==14){
            System.out.println(programmers+" программистов");
            return ;
        }
        switch (programmers%10){
            case 0: case 5: case 6: case 7: case 8: case 9:
                System.out.println(programmers+" программистов");
                break;
            case 1:
                System.out.println(programmers + " програмист");
                break;
            case 2: case 3: case 4:
                System.out.println(programmers+ " программиста");
                break;
        }
    }
}
