class Solution {
    public static int[] lcmAndGcd(int a, int b) {//using euclidean algo
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;  
        int lcm = (a / gcd) * b;
        return new int[]{lcm, gcd};
    }
}
