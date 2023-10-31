class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0) return false;

        HashMap<Integer , Integer> hm1 = new HashMap<>();
        int i = 0;

        for(int num : nums){
            if(hm1.containsKey(num) && Math.abs(i - hm1.get(num)) <= k) 
                return true;
            hm1.put(num , i);
            i++;
        }

        return false;
    }
}