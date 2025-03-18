class Solution {
    static int evenlyDivides(int n) {
        int count=0;
        int originaln=n;
        while(n>0){
            int lastdigit=n%10;
            if(lastdigit!=0 && originaln%lastdigit==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
