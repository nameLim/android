package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
    }

    //MCMXCIV = 1000 + 100 +
    public static int romanToInt(String s) {
        Map<String, Integer> roman2Int = new HashMap<>();
        roman2Int.put("I",1);
        roman2Int.put("V",5);
        roman2Int.put("X",10);
        roman2Int.put("L",50);
        roman2Int.put("C",100);
        roman2Int.put("D",500);
        roman2Int.put("M",1000);

        int sum=0;
        String[] romanArray = s.split("");
        int len = romanArray.length;
        for( int i =0; i<=len-1; i++){

            if(i == len-1) {
                int now = roman2Int.get(romanArray[i]);
                sum+=now;
                return sum;
            }

            int now = roman2Int.get(romanArray[i]);
            int next = roman2Int.get(romanArray[i+1]);
            sum = (now < next) ? (sum-now) : (sum+now);

        }
        return sum;

    }
}
