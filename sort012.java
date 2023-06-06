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

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 2, 1, 0, 1, 0 };
        sortColors(nums);
        printArray(nums);

    }
}