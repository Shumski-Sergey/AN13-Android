package ibagritsevich.lection_1;

public class TaskC {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary = binary.substring(binary.length()-8);
            binary = String.format("%8s",binary).replace("" ,"0");
            System.out.printf("%8s %4d %n",binary,i);

        }
        System.out.println("\n8-ричные числа:");
        for (byte i = -128; i != 127; i++) {
            String octal = Integer.toOctalString(i);
            if (octal.length()>8) octal = octal.substring(octal.length()-8);
            octal = String.format("%8s",octal).replace("" ,"0");
            System.out.printf("%8s %4d %n",octal,i);
        }

        System.out.println("\n16-ричные числа:");
        for (byte i = -128; i != 127; i++) {
            String hex = Integer.toHexString(i);
            if (hex.length()>7) hex = hex.substring(hex.length()-7);
            hex = String.format("%8s",hex).replace("" ,"0");
            System.out.printf("%8s %4d %n",hex,i);
        }
    }
}