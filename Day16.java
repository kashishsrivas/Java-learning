package fundamentals;

//minimum number
public class Day16 {
    public static void main(String[] args) {
        
        int [] arr = {12,45,7,89};
        int min = arr[0];

        for(int i =0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
