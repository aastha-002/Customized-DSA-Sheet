//REVERSE STRING ( Leetcode-344)
  
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(i>=j){
                    return;
                }
                char temp=s[i];
                s[i]=s[j];
                s[j]=temp;
                i++;
            }
        }
    }
}
