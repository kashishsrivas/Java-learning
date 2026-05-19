package fundamentals;

//count words
public class Day25 {
    public static void main(String[] args) {
        
        String str = "I love Java";

        int count =1;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println(count);
    }
}
