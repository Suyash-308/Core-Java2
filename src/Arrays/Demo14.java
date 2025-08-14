package Arrays;

public class Demo14 {
    public static void main(String[] args){
        int[] array={1,3,5,7,9,71};
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }

}
