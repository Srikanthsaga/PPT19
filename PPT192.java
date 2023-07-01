import java.util.*;

public class PPT192 {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> counts = new ArrayList<>();
        List<Integer> sortedNums = new ArrayList<>();
        
        // Traverse the input array in reverse order
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            int index = findInsertionIndex(sortedNums, num);
            counts.add(0, index);
            sortedNums.add(index, num);
        }
        
        return counts;
    }
    
    private int findInsertionIndex(List<Integer> sortedNums, int target) {
        int left = 0;
        int right = sortedNums.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedNums.get(mid) >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
