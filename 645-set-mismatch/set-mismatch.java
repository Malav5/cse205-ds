class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer , Integer> hm1 = new HashMap<>();
        int dup = 0;
        int miss = 0;

        for(int num : nums){
            if(hm1.containsKey(num)){
                dup = num;
            }
            else hm1.put(num , 1);
        }

        for(int i = 1 ; i <= nums.length ; i++){
            if(hm1.containsKey(i) == false){
                miss = i;
                break;
            }
        }

        return new int[]{dup , miss};
    }
}