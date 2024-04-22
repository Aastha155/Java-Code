public class Mergesort {
    public static String[] mergeSort(String arr[], int si, int ei) {
        if(si == ei) {
            String A[] = {arr[si]};
            return A;
        }
        int mid = si + (ei-si)/2;

        String [] arr1 = mergeSort(arr, si, mid);
        String [] arr2 = mergeSort(arr, mid+1, ei);
        String [] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static boolean isAlphabeticalsmaller(String str1, String str2) {
        if(str1.compareTo(str2) < 0) {
            return true;
        }
        return false;

    }

    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String arr[] = new String[m+n];
        int i = 0;
        int j = 0;;
        int k = 0;

        while(i < m && j < n) {
            if(isAlphabeticalsmaller(arr1[i], arr2[j])) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<m) {
            arr[k++] = arr1[i++];
        }

        while(j<n) {
            arr[k++] = arr2[j++];
        }

        return arr;
    }

    public static int majority(int nums[]) {
        int majoritycount = nums.length/2;

        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count += 1;
                }
            }
            if(count > majoritycount) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int lndsmallest(int nums[]) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i] > nums[j] && i<j) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(lndsmallest(arr));
    }
}
