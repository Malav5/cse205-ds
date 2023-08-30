class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt=cnt+1;
                ans=Math.max(ans,cnt);
            }
            else{
                cnt=0;
            }
        }
        return ans;
    }
}