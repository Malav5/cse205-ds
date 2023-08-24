class Q46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        solve(nums, 0, ans);
        return ans;
    }
    public static void solve(int[] arr, int ind, List<List<Integer>>ans){
        //Base case
        if(ind == arr.length){
            List<Integer> a1 = new ArrayList<>();
            for(int it : arr){
                a1.add(it);
            }
            ans.add(a1);
            return;
        }
        for(int i =ind;i<arr.length;i++){
            swap(arr,i,ind);
            solve(arr, ind+1 , ans);
            //Backtrekkeing
            swap(arr,i,ind);
        }
    }
    public static void swap(int[] arr, int si, int j){
        int temp=arr[si];
        arr[si] = arr[j];
        arr[j] = temp;
    }
}