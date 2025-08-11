package Arrays;

public class Demo6 {
    public static void main(String[] args){
        int[] array={10,2,40,80,70,50,45,980,32,800};
        int max=Integer.MIN_VALUE;
        int secondMax=max;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                secondMax=max;
                max=array[i];
            }
            if (array[i]<max && array[i]>secondMax){
                secondMax=array[i];
            }
        }
        System.out.println(max + "  "+ secondMax);
    }
}
