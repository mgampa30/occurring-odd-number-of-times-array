class Main {
    public static int findOddOccurringNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 3, 1};
        int oddOccurringNumber = findOddOccurringNumber(nums);
        System.out.println("Number occurring odd number of times: " + oddOccurringNumber);
    }
}
