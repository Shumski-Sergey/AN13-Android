package mshpudeyko.Practic1.TackC;

public class FirstTaskC {
    public static double convertCelsiumToFahrenheit(int celsium){
        double TC,TF;
        TC=celsium;
        TF=(9*TC)/5+32;
        return TF;
    }
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }
}
