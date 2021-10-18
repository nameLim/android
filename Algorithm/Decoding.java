package Java;

public class Decoding {
    public static void main(String[] args) {

        System.out.println(decode("3[a]z"));
    }

    private static String decode(String inputStr) {

        StringBuilder decodeBuilder = new StringBuilder();

//      문자  ']' 를 기준으로 자름
        for(String str: inputStr.split("]")) {
            int cnt = 1;

            StringBuilder sb1 = new StringBuilder();    // '[' 룰 만나기 전까지 받아오는 값
            StringBuilder sb2 = new StringBuilder();    // 1차 decode 값 + 새로 받아온 값

            // 문자 뒤에서부터 확인
            for(int i = str.length()-1; i>=0; i--) {
                char ch = str.charAt(i);

                // 문자'[' 일 경우 cnt 확인하여 decoding
                if(ch =='[') {
                    cnt = str.charAt(i-1)-'0';  // 문자 반복 횟수
                    sb1 = sb1.append(sb2);      // 1차 decode 와 새로 받아온 값 붙이기
                    sb2.setLength(0);

                    // decoding 하기
                    StringBuilder tmp = new StringBuilder();
                    while( cnt-- > 0) {
                        tmp.append(sb1);
                    }
                    sb2.insert(0,tmp);
                    sb1.setLength(0);
                }

                // 숫자가 아닐경우, 문자 받아오기
                else if(!Character.isDigit(ch)){
                    sb1.insert(0,ch);
                }

                // decode 값 + 새로 받아온 값
                if(i==0) {
                    sb2.insert(0,sb1);
                    sb1.setLength(0);
                }
            }

            //결과 값에 한 문자열 붙이기
            decodeBuilder.append(sb2);
        }
        return decodeBuilder.toString();
    }
}
