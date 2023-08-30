class Q1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s= "";
        String s1="";
        for(int i=0;i<word1.length;i++){
            s=s.concat(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            s1=s1.concat(word2[i]);
        }
        if (s.equals(s1)){
            return true;
        }
        else {
            return false;
        }
    }
}