
public class MQ1 {
    int missingNumber(int[] nums) {
        int n = nums.length;
        int summ = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums)
            sum += num;
        return summ- sum;
    }
}
