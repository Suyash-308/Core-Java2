package Arrays;

public class Demo7 {
    public static void main (String[] args){
        int[] array={10,30,40,32,89,65,56};
        int min=Integer.MAX_VALUE;
        int secondMin=min;
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                secondMin=min;
                min=array[i];
            }
            if (array[i]>min && array[i]<secondMin){
                secondMin=array[i];
            }
        }
        System.out.println("min is : "+min);
        System.out.println("Second min is : "+secondMin);

    }
}
