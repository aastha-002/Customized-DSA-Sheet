class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int [] freq=new int[26];
        int [] windfreq=new int[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int window=s1.length();
        for(int i=0;i<window;i++){
            windfreq[s2.charAt(i)-'a']++;
        }
        if(isequal(freq,windfreq)){
            return true;
        }
        for(int i=window;i<s2.length();i++){
            windfreq[s2.charAt(i)-'a']++;
            windfreq[s2.charAt(i-window)-'a']--;
           
            if(isequal(freq,windfreq)){
                return true;
            }
        }
        return false;
    }
    boolean isequal(int []freq1,int[]freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
