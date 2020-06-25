class Solution {
    // 官方题解3：循环交换
    // 需要考虑两种情况：n 与 k的最大公约数==1，一轮完成
    //                 n 与 k的最大公约数==m, m轮才能完成

    public void rotate(int[] nums, int k) {
        int N = GCD(k,nums.length); //最大公约数
        for (int i=0; i<N; i++) {
            int cur = i;
            int prev = nums[cur];
            do {
                int next = (cur+k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                cur = next;
            } while (cur != i);
        }



    }

    // 求最大公约数
    public int GCD(int m, int n){
        int temp;
        // m：大数 n：小数
        if (m < n) { //
            temp = n;
            n = m;
            m = temp;
        }
        if (m % n == 0)
            return n;
        return GCD(n,m%n);
    }
}