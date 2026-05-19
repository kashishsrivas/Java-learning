package fundamentals;

//reverse number
public class Day17 {
    public static void main(String[] args) {
        int [] arr = {10,20,30};

        //arr.length - 1 = traversing starts from backwards index 3 
        for(int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
