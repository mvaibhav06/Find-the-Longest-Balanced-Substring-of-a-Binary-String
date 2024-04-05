public class BalancedString {
    public static int findTheLongestBalancedSubstring(String s) {
        int zeroes = 0;
        int ones = 0;
        int max = 0;

        for(int i=0; i<s.length(); i++){
            int j = 0;
            for(j=i; j<s.length(); j++){
                if(s.charAt(j) == '0'){
                    zeroes++;
                }else{
                    break;
                }
            }
            for(int k=j; k<s.length(); k++){
                if(ones==zeroes && max<ones+zeroes){
                    max = ones+zeroes;
                }
                if(s.charAt(k)=='1'){
                    ones++;
                }else{
                    break;
                }
            }
            if(ones==zeroes && max<ones+zeroes){
                max = ones+zeroes;
            }
            ones = 0;
            zeroes = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("011"));
    }
}
