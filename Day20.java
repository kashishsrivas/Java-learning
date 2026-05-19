package fundamentals;

//search element
public class Day20 {
    public static void main(String[] args) {
        
        int [] arr = {10,20,30,40};

        int search = 50;

        for(int i =0; i<arr.length; i++){
            if(arr[i] == search){
                System.out.println("element found : " + arr[i]);
            }
        }
        System.out.println("not found");
    }
}
