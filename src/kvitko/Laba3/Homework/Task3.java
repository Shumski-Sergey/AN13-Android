package kvitko.Laba3.Homework;

public class Task3 {
    public static void main(String[] args) {
        int a[] = new int[15];
        for(int i=0;i<a.length;i++)
            a[i]=(int)(Math.random()*99);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        int kol_chet=0;
        for(int i:a){
            if(i%2==0) kol_chet++;
        }
        System.out.println("Количество четных элементов: "+kol_chet);
    }

}
