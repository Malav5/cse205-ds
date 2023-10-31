class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer , Integer> hm1= new HashMap<>();
        int cnt = 0;

        for(int num : nums){
            if(hm1.containsKey(num)){
                cnt += hm1.get(num);
                hm1.put(num , hm1.get(num) + 1);
            }

            else hm1.put(num , 1);
        }

        return cnt;
    }
}