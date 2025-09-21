package Arrays;

public class Practice {
    public static void main(String[] args){
        int[] Array={10,12,14,54,98,90,53,67,22};

//        Maximum element in Array

        int max=Integer.MIN_VALUE;
        for(int temp: Array){
            if (temp>max){
                max=temp;
            }
        }
        System.out.println("Maximum value is"+"\t"+max);

//     Minimum element in Array

        int min=Integer.MAX_VALUE;
        for(int temp:Array){
            if(temp<min){
                min=temp;
            }
        }
        System.out.println("Minimum value is "+"\t"+min);


//    Reverse the original Array
        int left=0; int right= Array.length-1;

        while (left<right) {
            int temp=Array[left];
            Array[left] = Array[right];
            Array[right] = temp;
            left++;
            right--;
        }
        for (int i : Array) {
            System.out.println(i);
        }





    }
}
