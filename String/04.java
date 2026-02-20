class Solution {
    public int compress(char[] chars) {
        int index=0;
        for(int i=0;i<chars.length;){
            char ch=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[index++]=ch;
            }
            else{
                chars[index++]=ch;
                String c=String.valueOf(count);
                for(char cnt : c.toCharArray()){
                    chars[index++]=cnt;
                }
            }
        }
        return index;
    }
}
