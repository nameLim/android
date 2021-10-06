package Java;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {

        if( x < 0 )
            return false;


        String[] strNum = Integer.toString(x).split("");

        for(int i=0, j=strNum.length-1; i<=j; i++,j-- ) {

            String front = strNum[i];
            String back = strNum[j];

            if(!front.equals(back))
                return false;
        }

        return true;
    }
}
