class Solution {
    // 官方题解3：循环交换
    // 需要考虑两种情况：n 与 k的最大公约数==1，一轮完成
    //                 n 与 k的最大公约数==m, m轮才能完成

    // 用交换次数count 控制
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int count = 0;
        for (int i=0; count < nums.length; i++) {
            int cur = i;
            int prev = nums[cur];
            do {
                int next = (cur + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                cur = next;
                count++;
            } while (cur != i);
        }
    }
}