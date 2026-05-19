package fundamentals;

//Arrays- Array stores multiple values of same type.
//arr.length - Gives total size.

//sum of array
public class Day14 {
    public static void main(String[] args) {
        
        int [] arr = {10,20,30};
        int sum =0;

        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
