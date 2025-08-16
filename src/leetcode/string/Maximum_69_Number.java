package leetcode.string;

public class Maximum_69_Number {
    public int maximum69Number (int num) {
        char[] s = String.valueOf(num).toCharArray();
        int i=0;
        while(i<s.length){
            if(s[i]=='6'){
                s[i]='9';
                break;
            }
            i++;
        }
        return Integer.parseInt(new String(s));
    }
}
