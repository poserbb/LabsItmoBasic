package lab4.part2;


public class MergeSort {

    public static void mergeSort(int[] fLArr) {
        int n = fLArr.length;
        if(n == 1) return;

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = fLArr[i];
        }
        for(int i = mid; i < n; i++){
            right[i - mid] = fLArr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(fLArr, left, right);
    }

    private static void merge(int[] fLArr, int[] left, int[] right) {
        int leftPart = left.length;
        int rightPart = right.length;
        int i = 0;
        int n = 0;
        int index = 0;

        while (i < leftPart && n < rightPart){
            if(left[i] < right[n]){
                fLArr[index] = left[i];
                i++;
            } else {
                fLArr[index] = right[n];
                n++;
            }
            index++;
        }

        for(int l2 = i; l2 < leftPart; l2++){
            fLArr[index++] = left[l2];
        }
        for(int r2 = n; r2 < rightPart; r2++){
            fLArr[index++] = right[r2];
        }
    }
}
