package Arrays;

public class Demo15 {
    public static void main (String[] args){
        int[] array={10,13,20};
        int sum=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                sum+=array[i];
            }
        }
        System.out.println("sum of even number is : "+sum);
    }
}
