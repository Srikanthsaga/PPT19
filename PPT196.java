public class PPT196 {
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mergedArray

        // Merge the arrays by comparing elements from arr1 and arr2
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from arr1, if any
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy the remaining elements from arr2, if any
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
