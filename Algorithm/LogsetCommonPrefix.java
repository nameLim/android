package Java;

public class LogsetCommonPrefix {

    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {


        if(strs.length == 0 )
            return "";
        if(strs.length == 1)
            return strs[0];

        String commonStr = strs[0]; // 기준, 첫번째값.

        for(int i=1; i < strs.length; i++) {
            String str = strs[i];
            if (str.equals(commonStr))
                continue;

            int idx = str.indexOf(commonStr);
            while (idx != 0) {
                commonStr = commonStr.substring(0, commonStr.length() - 1);
                idx = str.indexOf(commonStr);
            }
        }

        return commonStr;
    }
}

