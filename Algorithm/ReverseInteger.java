package Java;

public class ReverseInteger {

    public static void main(String[] args) {

    }
    public static int reverse(int x) {

        int rev = 0; //return  123
        int rem;

        if(x==0 || x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
            return 0;

        rev = 0;
        while(x!=0) {
            rem = x%10; //나머지 -> 3,  2, 1
            x/=10;  // 몫 -> x= 12, 1, 0
            rev = (rev*10) + rem;   // 0+3, 30+2, 320+1  // rev 3, 32, 320+1 => 321
        }


        return rev;//321
    }
}
