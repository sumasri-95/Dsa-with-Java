import java.util.Arrays;

public class MergeSortIterative {

  
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Iterative merge sort using loops
    static void mergeSort(int[] arr) {
        int n = arr.length;

        // width = size of subarray to merge
        for (int width = 1; width < n; width = 2 * width) {

            // pick left starting point of subarrays
            for (int left = 0; left < n; left += 2 * width) {

                int mid = Math.min(left + width - 1, n - 1);
                int right = Math.min(left + 2 * width - 1, n - 1);

                if (mid < right) {
                    merge(arr, left, mid, right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}