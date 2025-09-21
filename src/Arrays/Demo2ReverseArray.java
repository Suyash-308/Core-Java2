package Arrays;

public class Demo2ReverseArray {
    public static void main (String[]  args){
        int[] array={10,22,13,18,52};

      int left=0,right=array.length-1;
      while (left < right){
          int temp=array[left];
          array [left]=array[right];
          array [right]=temp;
          left++;
          right--;
      }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
