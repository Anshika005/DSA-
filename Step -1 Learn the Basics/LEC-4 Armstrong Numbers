class Solution {
    static boolean armstrongNumber(int n) {
        int sum=0;
        int on=n;
        while(n>0){
            int ld =n%10;
            sum = sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==on){
            return true;
        }
        return false;
    }
}
