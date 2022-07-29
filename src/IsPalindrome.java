public class IsPalindrome {

    public static int isPalindrome(String str){
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
