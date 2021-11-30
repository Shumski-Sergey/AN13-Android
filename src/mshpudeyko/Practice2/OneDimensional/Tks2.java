package mshpudeyko.Practice2.OneDimensional;

/*
* Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 ... 7 5 3 1).
* */
public class Tks2 {
    public static void main(String[] args) {
        int value=50;
        int[] array =new int[value];

        for(int i=0,k=1;i<value;i++,k+=2){
            array[i]=k;
            System.out.print("array["+i+"]="+array[i]+"  ");
        }
        System.out.println("\n");
        int temp;
        for(int i=0,k=value-1;i<value/2;i++,k--){
            temp=array[i];
            array[i]=array[k];
            array[k]=temp;
        }
        for(int i=0;i<value;i++){
            System.out.print("array["+i+"]="+array[i]+"  ");
        }
    }
}
