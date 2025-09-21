package Arrays;

public class Demo5MaxVal {
    public static void main(String[] args){
    int[] array={20,34,6,7,3,5,7,56,98,90};
    int max=Integer.MIN_VALUE;


     for(int i=0;i<array.length;i++){
         if (array[i]>max){
             max=array[i];
         }
     }
         System.out.println(max);

    }
}

