class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n; 
        
        int first = 1, second = 2; 
        for (int i = 3; i <= n; i++) {
            int third = first + second; // Number of ways to reach step `i`
            first = second;  
            second = third;  
        }
        
        return second;
    }
}
