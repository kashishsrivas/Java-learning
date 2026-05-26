package fundamentals;

// FIND FREQUENCY OF CHARACTERS
public class Day26 {
    public static void main(String[] args) {
        String str = "Kashish";

        char target = 'h';
        int count = 0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == target){
                count ++ ;
            }
        }
        System.out.println(count);
    }
}


