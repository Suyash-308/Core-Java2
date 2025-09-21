package Arrays;

public class Demo4MinVal {
    public static void main(String[] args){
        int[] array={12,45,10,60,43,65};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
