package neetcode.problems;

public class TwoSums {
    private final int target = 10;
    private final int[] nums = {4, 5, 6};

    public int[] Solve() {
        int[] resArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    resArr[0] = j;
                    resArr[1] = i;
                }
            }
        }

        return resArr;
    }
}
