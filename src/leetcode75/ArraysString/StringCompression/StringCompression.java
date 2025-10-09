package leetcode75.ArraysString.StringCompression;

public class StringCompression {


    static int compress(char[] chars) {
        if (chars.length==1) return 1;
        int currentCount=1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        for (int i=1;i< chars.length;i++){

            if (chars[i-1]==chars[i]){
                currentCount++;
            } else if (chars[i-1]!=chars[i]) {
                if (currentCount>1){
                    sb.append(currentCount);

                }
                sb.append(chars[i]);
                currentCount=1;
            }
        }
        if (currentCount>1){
            sb.append(currentCount);

        }

        for (int i = 0; i < sb.length() ; i++) {
            chars[i]=sb.charAt(i);
        }
        return sb.length();

    }
    public static void main(String[] args) {

       /* Input: chars = ["a","a","b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".*/
//        char[] chars = {'a','a','b','b','c','c','c'};
//        char[] chars = {'a'};
        char[] chars =  {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
