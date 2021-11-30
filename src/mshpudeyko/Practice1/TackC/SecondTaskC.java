package mshpudeyko.Practice1.TackC;

public class SecondTaskC {
    public static int sumDigitsInNumber(int number){
        int num1=number%10;
        int num2=number%100/10;
        int num3=number%1000/100;
        int num4=number/1000;
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
}
