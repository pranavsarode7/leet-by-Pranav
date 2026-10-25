class Solution {
    public int calculateScore(int a, int b) {
        int result=0;
        int s11=0;
        int s22=0;
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1'){
                s11++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='1'){
                s22++;
            }
        }
        if(s11>=s22){
            result=s11*s22;
        }
        else{
            result=s22/s11;
        }
        return result;
    }
}