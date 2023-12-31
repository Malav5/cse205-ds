class Q1051 {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        int cnt = 0;

        for(int i = 0 ; i < heights.length ; i++) arr[i] = heights[i];

        quickSort(heights , 0 , heights.length - 1);

        for(int i = 0 ; i < heights.length ; i++){
            if(arr[i] != heights[i]) cnt++;
        }

        return cnt;
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}