class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int ox=x;
        while(x>0){
            int ld=x%10;
            reverse=(reverse*10)+ld;
            x=x/10;
        } 
        if (reverse==ox){
            return true;
        }
        return false;
    }
}
