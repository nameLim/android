package Java;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {

        FindString fs = new FindString();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);

        System.out.println(fs.solution(input1,input2));
    }
    private int solution(String inputStr, char c) {
        int answer = 0;

        inputStr = inputStr.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i=0; i<inputStr.length(); i++) {
            if(inputStr.charAt(i) == c)
                answer++;
        }

        return answer;
    }
}
