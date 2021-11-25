package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class OneMoreTsk3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value = scanner.nextInt();
        int count = 0, temp = value;
        while(temp>0){
            temp/=10;
            count++;//разряд
        }
        int prod=1;//10 в степени разряда
        for(int i=1;i<count;i++){
            prod*=10;
        }

        if(count%3==0){
            for(int i=1,k=1;i<=count ;i++){
                System.out.print(value/prod);
                if(i/3==k){
                    System.out.print(" ");
                    k++;
                }
                value=value-(value/prod)*prod;
                prod/=10;
            }
        }

        if(count%3==1){
            for(int i=1,k=1;i<=count;i++){
                System.out.print(value/prod);
                if(i/k==1){
                    System.out.print(" ");
                    k+=3;
                }
                value=value-(value/prod)*prod;
                prod/=10;
            }
        }

        if(count%3==2){
            for(int i=1,k=2;i<=count;i++){
                System.out.print(value/prod);
                if(i/k==1){
                    System.out.print(" ");
                    k+=3;
                }
                value=value-(value/prod)*prod;
                prod/=10;
            }
        }
    }
}
