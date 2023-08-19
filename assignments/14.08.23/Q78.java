class Q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        subsets(0,nums,new ArrayList(),result);
        return result;
    }
    void subsets(int x,int[] nums,List<Integer> cur,List<List<Integer>> result)
    {
        result.add(new ArrayList(cur));

        for (int i=x; i<nums.length;i++)
        {
            cur.add(nums[i]);
            subsets(i+1,nums,cur,result);
            cur.remove(cur.size()-1);
        }
    }
}