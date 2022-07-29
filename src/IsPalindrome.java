public class IsPalindrome {

    //if its palindrome then return 1, else 0
    public static int isPalindrome(String str){

        // get two pointers from the beginning and the ending, and run a loop until they meet
        // if both of the characters are equal then move the pointers and return 1, else 0
        int i=0;
        int j = str.length()-1;

        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return 0;
            }
        }return 1;
    }
    public static void main(String[] args) {

    }
}
