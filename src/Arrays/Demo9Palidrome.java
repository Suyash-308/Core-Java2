package Arrays;

public class Demo9Palidrome {
    public static void main(String[] args){
    int[] array={10,20,30,43,20,10};

    int left=0,right=array.length-1;

    boolean isPalindrome=true;
    while(left<right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        if(array[left] != array[right]){
          isPalindrome=false;
          break;
        }
        left++;
        right--;
    }

    for (int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
System.out.println(isPalindrome?" palindrome": "not palindrome");
    }
}
