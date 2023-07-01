public class PPT194 {
    public void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int left = 0; // left pointer

        // Move all non-zero elements to the left side of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[left++] = arr[i];
            }
        }

        // Fill the remaining positions with zeroes
        while (left < n) {
            arr[left++] = 0;
        }
    }
}
