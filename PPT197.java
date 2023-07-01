import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class PPT197 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add common elements from nums2 to set2
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        // Convert set2 to an array
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        return result;
    }
}
