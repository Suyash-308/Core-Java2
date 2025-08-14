package Arrays;

public class Demo16 {
    public static void main(String[] args){
        int[] array={12,13,14,15,16};
        int sum=0;

        for (int i=0;i<array.length;i++){
            if (array[i]%2==1){
                sum+=array[i];
            }
        }
        System.out.println("sum of odd number is : "+sum);
    }
}
