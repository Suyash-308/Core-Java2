package Arrays;

public class Demo {
    public static void main(String[] args){
        int[] array= {1, 3, 6, 8};

        int left=0 ;
        int right= array.length-1;

        while (left<right){
            int temp=array[left];
           array[ left]= array[right];
            array[ right]=temp;

            left++;
            right--;
        }
        for (int f : array) {
            System.out.println(f);

        }
    }
}
