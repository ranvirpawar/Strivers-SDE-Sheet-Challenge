import javax.lang.model.util.ElementScanner14;

class sort012 {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int nextZero = 0;
        int nextTwo = n - 1;
        while (i <= nextTwo) {
            if (nums[i] == 0) {
                int temp = nums[nextZero];
                nums[nextZero] = nums[i];
                nums[i] = temp;
                i++;
                nextZero++;
            } else if (nums[i] == 2) {
                int temp = nums[nextTwo];
                nums[nextTwo] = nums[i];
                nums[i] = temp;
                // i++;
                nextTwo--;
            } else {
                i++;
            }
        }
    }
    //// code studio
    public static void Sort0123(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
/////////////////////////////////////////////////////////////////////
    public static void sort(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else if (nums[i] == 1) {
                ones++;
            } else if (nums[i] == 2) {
                zeros++;
            }
        }
        int k = 0;
        while (zeros > 0) {
            nums[k] = 0;
            zeros--;
            k++;
        }
        while (ones > 0) {
            nums[k] = 1;
            ones--;
            k++;
        }
        while (twos > 0) {
            nums[k] = 2;
            twos--;
            k++;
        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 2, 1, 0, 1, 0 };
        // sortColors(nums);
        Sort0123(nums);
        printArray(nums);

    }
}
