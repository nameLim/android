package Java;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        isValid("()");
    }
    public static boolean isValid(@NotNull String s) {

        Map<String, String> charsMap = new HashMap<>();
        List<String> checkList = new ArrayList<>();

        charsMap.put("(", ")");
        charsMap.put("[", "]");
        charsMap.put("{", "}");

        boolean isFirst = true;
        for(String str : s.split("")) {

            checkList.add(str);
            if(isFirst && !charsMap.containsKey(str)) // ), ], } 첫 값이 일 경우
                return false;

            int lastIdx = checkList.size()-1;
            String key = checkList.get(lastIdx);

            if(str.equals(")")){

                if(!key.equals("("))
                    return false;
                checkList.remove(lastIdx);
            }
            else if(str.equals("]")) {

                if(!key.equals("["))
                    return false;
                checkList.remove(lastIdx);
            }
            else if(str.equals("}")) {

                if(!key.equals("{"))
                    return false;
                checkList.remove(lastIdx);
            }


            isFirst = true;
        }

        //list 빈값 체크가 필요함

        return true;
    }
}
