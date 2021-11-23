package aalekseenko.Lection1;

public class TaskC {
    public static void main(String[] args) {
        System.out.println("Binary Octal Hex Dec");
        for (byte i = 0; i != -1; i++) {
        String binary = Integer.toBinaryString(i);
        String Octal = Integer.toOctalString(i);
        String Hex = Integer.toHexString(i);
        if (binary.length()>8) binary=binary.substring(binary.length()-8);
        binary = String.format("%8s", binary).replace(" ", "0");
        if (Octal.length()>3) Octal=Octal.substring(Octal.length()-3);
        Octal = String.format("%3s", Octal).replace(" ", "0");
        if (Hex.length()>2) Hex=Hex.substring(Hex.length()-2);
        Hex = String.format("%2s", Hex).replace(" ", "0");
        System.out.printf("%8s ",binary);
        System.out.printf("%3s ",Octal);
        System.out.printf("%2s %4d",Hex, i);
        System.out.println();
    }
        String binary = Integer.toBinaryString(-1);
        String Octal = Integer.toOctalString(-1);
        String Hex = Integer.toHexString(-1);
        binary=binary.substring(binary.length()-8);
        binary = String.format("%8s", binary).replace(" ", "0");
        Octal=Octal.substring(Octal.length()-3);
        Octal = String.format("%3s", Octal).replace(" ", "0");
        Hex=Hex.substring(Hex.length()-2);
        Hex = String.format("%2s", Hex).replace(" ", "0");
        System.out.printf("%8s ",binary);
        System.out.printf("%3s ",Octal);
        System.out.printf("%2s %4d",Hex, -1);
        System.out.println();


    }


}
