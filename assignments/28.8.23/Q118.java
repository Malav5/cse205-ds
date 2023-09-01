class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> ans = new ArrayList<>();
            int n = 1;
            for (int j = 0; j <= i; j++) {
                ans.add(n);
                n = n * (i - j) / (j + 1);
            }
            out.add(ans);
        }
        
        return out;
    }
}