package neetcode.problems;

public class ContainsDuplicate {
    private final int[] nums = {1, 2, 3, 4, 4, 5, 6, 7, 8};

    public Boolean solve() {
        for (int i = 0; i < nums.length; i++) {
            for (
                    int j = 0; j < nums.length; j++
            ) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
