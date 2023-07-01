import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class PPT198 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Build frequency map for nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check intersection with nums2 and update the result
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert result ArrayList to an array
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}
