public class PPT195 {
    public void rearrangeAlternate(int[] arr) {
        int n = arr.length;
        int positiveIndex = 0;
        int negativeIndex = 0;

        // Find the index of the first positive number
        while (positiveIndex < n && arr[positiveIndex] < 0) {
            positiveIndex++;
        }

        // Rearrange the array in alternating positive and negative fashion
        while (positiveIndex < n && negativeIndex < n) {
            // Swap the positive number with the next negative number
            int temp = arr[positiveIndex];
            arr[positiveIndex] = arr[negativeIndex];
            arr[negativeIndex] = temp;

            positiveIndex += 2; // Move to the next positive number
            negativeIndex += 2; // Move to the next negative number
        }
    }
}
