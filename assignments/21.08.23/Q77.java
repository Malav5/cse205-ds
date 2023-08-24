import java.util.*;
class Q77 {
    public List<List<Integer>> combine(int n, int k) {
        return combine1(n,k);
    }
    public List<List<Integer>> combine1(int n, int k){
        List<List<Integer>> result= new ArrayList<>();
        if(k==1){
            for(int i=1;i<=n;i++){
                List<Integer> a =new ArrayList<>();
                a.add(i);
                result.add(a);
            }
            return result;
        }
        else if(n==k){
            List<Integer> a = new ArrayList<>();
            for(int i=1;i<=n;i++){
                a.add(i);
            }
            result.add(a);
            return result;
        }
        List<List<Integer>> ans1 = combine1(n - 1, k);
        List<List<Integer>> ans2 = combine1(n - 1, k - 1);
        for (List<Integer> a : ans2) {
            a.add(n);
            result.add(a);
        }
        for (List<Integer> a : ans1) {
            result.add(a);
        }
        return result;
        
    }
}