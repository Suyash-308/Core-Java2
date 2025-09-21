package Arrays;

public class Demo10CheckEqual {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 50, 20};
        int[] arr2 = {10, 30, 50, 20};
        System.out.println(equals(arr1, arr2));
    }
        public static boolean equals(int[] arr1,int[] arr2) {
            if (arr1 == null || arr2 == null) {
                return false;
            }
            if (arr1.length != arr2.length){
                return false;
            }
            for (int i=0;i<arr1.length;i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

}
