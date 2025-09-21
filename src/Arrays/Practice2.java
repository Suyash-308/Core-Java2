package Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] array = {37, 65, 35, 66, 45, 69, 98, 78, 90, 5};

        int max= Integer.MIN_VALUE;
        int SecMax=max;

        for (int temp:array) {
            if (temp> max) {
                SecMax = max;
                max =temp;
            }

            if (temp< max &&  temp>SecMax) {
                SecMax= temp;
            }
        }
        System.out.println(max +" "+SecMax);
    }
}